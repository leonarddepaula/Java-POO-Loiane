package exe00;

public class TesteCarro {
    public static void main(String[] args) {

        Carro Bravo = new Carro();
        Bravo.marca = "FIAT";
        Bravo.modelo = "Hatch-Medio";
        Bravo.numPassageiros = 5;
        Bravo.capCombustivel = 58;
        Bravo.consumoCombustivel = 9.9;

        System.out.println(Bravo.marca);
        System.out.println(Bravo.modelo);

        Carro GOl = new Carro();
        GOl.marca = "Volkswagen";
        GOl.modelo = "Hatch";
        GOl.numPassageiros = 5;
        GOl.capCombustivel = 48;
        GOl.consumoCombustivel = 12.9;

        System.out.println(GOl.marca);
        System.out.println(GOl.modelo);
    }
}
