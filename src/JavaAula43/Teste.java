package JavaAula43;

import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Engenharia de Software");
        double [] notas = {10, 9, 7, 6};
        aluno.setNotas(notas);

        System.out.println(aluno);


    }
}
