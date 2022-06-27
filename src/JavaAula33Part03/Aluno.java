package JavaAula33Part03;

public class Aluno {

    private String nome;
    private String matricula;
    private String NomeCurso;
    private String [] nomeDasDiciplinas ;
    private double [][] notasDisciplinas;

    public Aluno() {
        nomeDasDiciplinas = new String[3];
        notasDisciplinas =  new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDasDiciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.NomeCurso = nomeCurso;
        this.nomeDasDiciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }

    public String[] getNomeDasDiciplinas() {
        return nomeDasDiciplinas;
    }

    public void setNomeDasDiciplinas(String[] nomeDasDiciplinas) {
        this.nomeDasDiciplinas = nomeDasDiciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void  mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do Curso: " + NomeCurso);

        for (int i = 0; i <notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina: " + nomeDasDiciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice){

        double soma = 0 ;

        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;

        if (media >= 7){
            return true;
        }else {
            return false;
        }
    }

    public void seNomeDisciplinanaPos(int pos, String nomeDisciplina){
        this.nomeDasDiciplinas[pos] = nomeDisciplina;
    }

    public  void setNomePosIJ(int posI, int posJ, double nota){
        this.notasDisciplinas[posI][posJ] = nota;
    }
}
