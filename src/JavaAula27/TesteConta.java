package JavaAula27;

public class TesteConta {
    public static void main(String[] args) {

        Contacorrente conta = new Contacorrente();

        conta.numero= "1234567";
        conta.agencia = "001A";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        System.out.println("Saldo da conta: " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if(saqueEfetuado) {
            System.out.println("saque efetuado com sucesso");
            conta.consultaSaldo();
        }else {
            System.out.println("nao foi possivel realizar o saque!");
        }
        saqueEfetuado = conta.realizarSaque(500);

        if(saqueEfetuado) {
            System.out.println("saque efetuado com sucesso");
            conta.consultaSaldo();
        }else {
            System.out.println("nao foi possivel realizar o saque!");
        }
        System.out.println("Deposito 500 reais");
        conta.depositar(500);
        conta.consultaSaldo();

        if (conta.verificarUsoChequeEsécial()){
            System.out.println("Esta usando cheque especial. ");
        }else {
            System.out.println("Não está usando cheque especial.");
        }
        conta.realizarSaque(600);
        conta.consultaSaldo();
        if (conta.verificarUsoChequeEsécial()){
            System.out.println("Esta usando cheque especial. ");
        }else {
            System.out.println("Não está usando cheque especial.");
        }
    }
}
