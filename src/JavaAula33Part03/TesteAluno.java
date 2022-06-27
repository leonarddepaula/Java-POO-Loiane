package JavaAula33Part03;


import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Entre com o nome do aluno: ");
        aluno.setNome(scan.next());

        System.out.print("Entre com o nome do curso: ");
        aluno.setNomeCurso(scan.next());

        System.out.print("Entre com numero de matricula: ");
        aluno.setMatricula(scan.next());


        for (int i = 0; i < aluno.getNomeDasDiciplinas().length; i++){
            System.out.println("Entre com o nome da "+ (i+1) + "º Diciplina: ");
            aluno.seNomeDisciplinanaPos(i, scan.next());
        }
        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++){
            System.out.println("Obtendo notas da disciplina: " + aluno.getNomeDasDiciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++){
                System.out.print("Entre com a  " + (j + 1) + "º nota: ");
                aluno.setNomePosIJ(i, j, scan.nextDouble());
            }
        }
        System.out.println();
        System.out.println("**** Dados do aluno ****");
        aluno.mostrarInfo();

        for (int i = 0; i < aluno.getNomeDasDiciplinas().length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.getNomeDasDiciplinas()[i] + "- foi aprovado");
            }else{
                System.out.println("Disciplina " + aluno.getNomeDasDiciplinas()[i] + "- foi aprovado");
            }
        }// exercicio 33 parte 4.

    }


}
