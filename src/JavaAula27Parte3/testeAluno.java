package JavaAula27Parte3;

import java.util.Scanner;

public class testeAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Entre com o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.print("Entre com o nome do curso: ");
        aluno.NomeCurso = scan.next();

        System.out.print("Entre com numero de matricula: ");
        aluno.matricula = scan.next();


        for (int i = 0; i < aluno.nomeDasDiciplinas.length; i++){
            System.out.println("Entre com o nome da "+ (i+1) + "º Diciplina: ");
            aluno.nomeDasDiciplinas[i] = scan.next();
        }
        for (int i = 0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina: " + aluno.nomeDasDiciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.print("Entre com a  " + (j + 1) + "º nota: ");
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }
        System.out.println();
        System.out.println("**** Dados do aluno ****");
        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDasDiciplinas.length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.nomeDasDiciplinas[i] + "- foi aprovado");
            }else{
                System.out.println("Disciplina " + aluno.nomeDasDiciplinas[i] + "- foi aprovado");
            }
        }

    }
}
