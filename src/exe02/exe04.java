package exe02;

import java.util.Date;

public class exe04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Eram os Deuses os  Astronautas.";
        livro.autor = "Erich von Däniken";
        livro.anoLancamento = 1968;
        livro.qtdPaginas = 267;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.locatiro = "leo";

        System.out.println("Nome Do Livro: " + livro.dataEntrega);
    }
}
