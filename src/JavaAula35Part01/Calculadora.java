package JavaAula35Part01;
/***
 * Escreva um método recursivo e estatico que calcule e retorne o N-ésimo termo da sequencia FIbonacci.
 * Alguns números desta sequencia são: 0,1,1,2,3,5,8,13,21,34,55,89.....
 */

public class Calculadora {
    public static int fibonacci(int num){

        if (num < 2){
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2);

    }
}
