package JavaAula29;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){
        System.out.println("Classe Carro Foi Estanciada");
        numPassageiros = 4 ;
    }

    Carro(String marca_){
        marca = marca_;
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
