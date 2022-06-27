package JavaAula34Part02;
/**
 *Escreva uma classe Calculadora que tenha os seguintes métodos: somar, subtrair
 * multiplicar, dividir (dois números), elevar à potência n.
 * Desenvolva um programa para testar essa classe.
 * */

public class Calculadora {

    public static int soma(int num1, int num2){
        return  num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        return  num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return  num1 * num2;
    }

    public static int dividir(int num1, int num2){
        return  num1 / num2;
    }

    public static double potencia(int num1, int num2){

        return  Math.pow(num1,num2); // potencia
    }

    public static int factoreal(int num){
            if(num == 0){
                return 1;
            }
            int fac =1;
            for (int i = num; i >= 1; i--){
               fac  *=  i;

            }
        return fac;
    }



}
