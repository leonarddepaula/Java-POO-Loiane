package JavaAula43Part02;

public class teste {
    public static void main(String []args){

        PessoaFisica pessoaFisica =  new PessoaFisica();
        pessoaFisica.setNome("Contribuinte 01");
        pessoaFisica.setRendaBruta(1000);
        pessoaFisica.setCpf("69342996396");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Contribuinte 02");
        pessoaJuridica.setRendaBruta(5000);
        pessoaJuridica.setCnpj("84.875.965/0001-18");

        PessoaFisica pessoaFisica1 =  new PessoaFisica();
        pessoaFisica1.setNome("Contribuinte 03");
        pessoaFisica1.setRendaBruta(2000);
        pessoaFisica1.setCpf("82271092418");

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
        pessoaJuridica1.setNome("Contribuinte 04");
        pessoaJuridica1.setRendaBruta(3000);
        pessoaJuridica1.setCnpj("38.948.429/0001-88");

        PessoaFisica pessoaFisica2 =  new PessoaFisica();
        pessoaFisica2.setNome("Contribuinte 05");
        pessoaFisica2.setRendaBruta(3700);
        pessoaFisica2.setCpf("22708262211");

        PessoaJuridica pessoaJuridica2 = new PessoaJuridica();
        pessoaJuridica2.setNome("Contribuinte 06");
        pessoaJuridica2.setRendaBruta(4000);
        pessoaJuridica2.setCnpj("47.804.029/0001-90");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pessoaFisica;
        contribuintes[1] = pessoaFisica1;
        contribuintes[2] = pessoaFisica2;
        contribuintes[3] = pessoaJuridica;
        contribuintes[4] = pessoaJuridica1;
        contribuintes[5] = pessoaJuridica2;

        for (Contribuinte c : contribuintes){
            System.out.println(c.toString());
        }
    }
}
