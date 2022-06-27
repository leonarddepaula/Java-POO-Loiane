package JavaAula35;

public class Calculadora {
    public static int factorealNaoRecursivo(int num){

        if(num == 0){
            return 1;
        }
        int fac =1;
        for (int i = num; i >= 1; i--){
            fac  *=  i;

        }
        return fac;
    }

    public static int factorial(int num){ // recursividade

        if (num == 0){
            return 1;
        }
        return num * factorial(num-1);
    }
}
