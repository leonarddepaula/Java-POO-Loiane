package exe02;
/**
 * Crie uma classe Livro que represente os dados básicos de um livro, sem
 * se preocupar com a sua finalidade.
 * */
public class exe02 {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.nome = "Eram os Deuses os  Astronautas.";
        livro.autor = "Erich von Däniken";
        livro.anoLancamento = 1968;
        livro.qtdPaginas = 267;

        System.out.println("Nome Do Livro: " + livro.nome);
    }
}
