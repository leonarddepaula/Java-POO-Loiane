package JavaAula27;

public class Contacorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar){

        // saldo na conta
        if(saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        }else{ // nao tem saldo
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if(limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                }else{
                    return false;
                }

            }else {
                return false;// não é especial e nao tem saldo suficiente
            }

        }
    }
    void depositar (double valorDepositado) {
        saldo += valorDepositado;
    }
    void consultaSaldo(){
        System.out.println("Saldo da conta: " + saldo);
    }
    boolean verificarUsoChequeEsécial(){
        return saldo < 0;
    }
}
