package Java.Aula25;

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

        Bravo.exibirAutonomia();

        double autonomia = Bravo.obterAutonomia();
        System.out.println(Bravo.obterAutonomia());

        double qtdCombustivel10 = Bravo.calcularCombustivel(10);
        double qtdCombustivel15 = Bravo.calcularCombustivel(15);
        double qtdCombustivel16 = Bravo.calcularCombustivel(16.5);
        System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
        System.out.println("qtdCombustivel10 = " + qtdCombustivel15);
        System.out.println("qtdCombustivel10 = " + qtdCombustivel16);


    }
}

