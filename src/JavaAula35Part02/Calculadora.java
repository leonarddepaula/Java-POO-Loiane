package JavaAula35Part02;

/**
 * Escreva um metodo recursivo e estático que receba um numero inteiro positivo N e calcule o
 * somatorio dos números de 1 a N.*/

public class Calculadora {

    public static int somatorio(int num ){

        if (num == 1){
            return 1;
        }
        return num + somatorio(num-1);
    }
}
