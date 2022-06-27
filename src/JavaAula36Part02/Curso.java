package JavaAula36Part02;
/**
 * Escreva uma classe para representar um Curso, que tem nome e horario.
 * cada curso tem um Professor, que possui um nome, departamento e email.
 * Cada Curso tambem pode ter vários alunos (tipo Aluno). Cada Aluno tem nome, matricula e 4 notas.
 * Escrever um programa teste qye crie um Curso com 5 alunos e que peça para o usuario enetrar com as 4 notas de cada
 * aluno. Ao final, imprima a média de cada aluno, se o mesmo está aprovado (media maior ou igual a 7),
 * e qual é a media da turma  */

public class Curso {

    private String nome;
    private String horario;
    private Professor porfessor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getPorfessor() {
        return porfessor;
    }

    public void setPorfessor(Professor porfessor) {
        this.porfessor = porfessor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo(){
        String info  =  "Nome do Curso = " + nome + "\n";

        if (porfessor != null){
            info += porfessor.obterInfo();
        }
        if (alunos != null){
            System.out.println("---Alunos---");
            for (Aluno aluno: alunos){
                if (aluno != null) {
                    info += aluno.obterInfo();
                    info += "\n";
                }
            }
            info += "\nMédia da turma = " + obterMediaTurma();
        }
        return info;
    }

    public  double obterMediaTurma(){
        double soma = 0;
        for (Aluno aluno: alunos){
            if (aluno != null){
                soma += aluno.obterMedia();
            }

        }
        return soma/ alunos.length;
    }
}
