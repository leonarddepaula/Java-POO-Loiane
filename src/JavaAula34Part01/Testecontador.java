package JavaAula34Part01;

public class Testecontador {

    static  void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {

        imprimirValor();
        Contador.incrementar();

        imprimirValor();

        Contador.zerar();

        imprimirValor();
    }
}
