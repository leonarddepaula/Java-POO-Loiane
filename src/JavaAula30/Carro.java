package JavaAula30;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {
    }

    public Carro(String marca, String modelo) {

    }
    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    void exibirAutonomia(){
        System.out.println("Aautonomia do carro é: " + capCombustivel*consumoCombustivel + "Km");
    }

    double obterAutonomia(){

        System.out.println("Metodo Obter autonomia foi chamado! ");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }

}
