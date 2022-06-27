package exe05;

public class exe05 {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero =  "12456";
        conta.agencia = "0001";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da Conta: " + conta.numero + " = " + conta.saldo);

    }
}
