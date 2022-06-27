package exe02;



/**
 * Usando o resultado do exercicio  anterior como base ,
 * cria uma classe "LivroDeLivraria" que represente os dados
 * basicos de um livro de uma biblioteca que pode ser emprestado a leitores.*/

public class exe03 {
    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria();

        livro.nome = "Eram os Deuses os  Astronautas.";
        livro.autor = "Erich von Däniken";
        livro.anoLancamento = 1968;
        livro.qtdPaginas = 267;
        livro.preco = 63.39;
    }
}
