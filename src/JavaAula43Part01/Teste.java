package JavaAula43Part01;

public class Teste {
    public static void main(String[] args) {

        System.out.println("*** Teste Conta Bancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente conta Simples");
        contaSimples.setNumConta("00101");

        contaSimples.depositar(100.75);

        relaizarSaque(contaSimples, 50);
        relaizarSaque(contaSimples, 70);

        System.out.println(contaSimples);
        System.out.println(" ");


        System.out.println("*** Teste Conta Poupanca ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente conta Poupança");
        contaPoupanca.setNumConta("00202");
        contaPoupanca.setDiaRendimento(21);

        contaPoupanca.depositar(100);

        relaizarSaque(contaPoupanca, 50);
        relaizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNvovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, Novo Saldo é de: " + contaPoupanca.getSaldo());
        }else{
            System.out.println("Hoje não é dia de rendimento!!!");

        }

        System.out.println(contaPoupanca);
        System.out.println(" ");

        System.out.println("*** Teste Conta Especial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente conta Especial");
        contaEspecial.setNumConta("00303");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        relaizarSaque(contaEspecial, 50);
        relaizarSaque(contaEspecial, 70);
        relaizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);



    }
    public static void relaizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        }else {
            System.out.println("Saldo insuficiente para saque de " + valor +"; saldo de = " + conta.getSaldo() );
        }
    }
}
