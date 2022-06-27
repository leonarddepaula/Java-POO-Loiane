package JavaAula36Part01;
/**
 * Escreva uma classe Agenda, que contem vários contatos do tipo Contato.
 * cada contato possui nome, telefone e email. A Agenda tambem posui um nome.
 * Crie um progroma teste que peça para o usuario entrar com o nome da Agenda e em seguida 3 Contatos
 * Crie métodos que retornem uma String com a informação de cada contato e também de todos contatos da agenda.*/

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo(){
        String info  =  "Nome: " + nome + "\n";

        if (contatos != null){
            for (Contato c: contatos){
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }
}
