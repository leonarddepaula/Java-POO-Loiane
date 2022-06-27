package JavaAula35;

public class TesteCalculadora {
    public static void main(String[] args) {

        int fatorialNR = Calculadora.factorealNaoRecursivo(5);
        System.out.println(fatorialNR);


        int fatorialR = Calculadora.factorial(5);
        System.out.println(fatorialR);
    }
}
