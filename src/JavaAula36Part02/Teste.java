package JavaAula36Part02;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("entre com o nome do curso: ");
        String nome = scan.nextLine();

        System.out.print("Entre como horario do curso: ");
        String horario = scan.nextLine();

        System.out.print("Entre com o nome do Professor: ");
        String nomeProf = scan.nextLine();

        System.out.print("Entre com o departamento do professor: ");
        String depProf = scan.nextLine();

        System.out.print("Entre com o email do professor: ");
        String emailProf =  scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);

        curso.setPorfessor(professor);

        System.out.println("---Alunos---");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i<5; i++){

            scan.nextLine();
            System.out.println("Entre com o nome do aluno: " + (i+1));
            String nomeAluno = scan.nextLine();

            System.out.println("Entre com o numero de matricula do aluno: ");
            String matAluno =  scan.nextLine();

            double[] notas = new double[4];

            for (int j =0; j<4; j++){
                System.out.println("Entre com a nota " + (j+1));
                notas[j] = scan.nextDouble();
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }
        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());

    }
}
