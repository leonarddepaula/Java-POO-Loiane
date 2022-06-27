package JavaAula34Part02;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(Calculadora.soma(1,3));
        System.out.println(Calculadora.subtrair(3,1));
        System.out.println(Calculadora.multiplicar(1,3));
        System.out.println(Calculadora.dividir(3,1));
        System.out.println(Calculadora.potencia(3,3));
        //System.out.println(Calculadora.factoreal(5));


        System.out.println("Entre com um valor Positivo: ");
        int numero;
        numero = scan.nextInt();
        System.out.println(Calculadora.factoreal(numero));
    }
}
