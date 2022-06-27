package JavaAula33Part02;



public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.setAgencia("1234567");
        conta.setAgencia("001A");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        //conta.setValorEspecialUsado(0);
        conta.setSaldo(-10);


        System.out.println("Saldo da conta: " + conta.getNumero() + " = " + conta.getSaldo());

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
