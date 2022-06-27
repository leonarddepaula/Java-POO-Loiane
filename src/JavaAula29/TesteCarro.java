package JavaAula29;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "FIAT";
        van.modelo = "Ducato";
        //van.numPassageiros = 10;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numPassageiros);

        Carro van2 = new Carro("Fiat");
        van2.modelo = "Ducato";


        System.out.println(van2.marca);
    }
}
