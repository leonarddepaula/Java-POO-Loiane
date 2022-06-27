package JavaAula36Part01;

import java.util.Scanner;

public class TesteAgenda {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre como nome da agenda : ");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda();

        //agenda.setNome("leo");

        Contato[] contatos = new Contato[3];
        for (int i =0; i < 3; i ++){
            System.out.println("entre com as informações do contato " + (i+1));
            Contato c = new Contato();


            System.out.print("Entre com o nome: ");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.print("Entre com o telefone: ");
            String telefone = scan.nextLine();
            c.setTel(telefone);

            System.out.print("Entre com o email: ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }
        agenda.setContatos(contatos);

        if (agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }
}
