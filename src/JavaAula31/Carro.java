package JavaAula31;

 public class Carro {
    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    public void exibirAutonomia(){
        System.out.println("Aautonomia do carro é: " + capCombustivel*consumoCombustivel + "Km");
    }

    public double obterAutonomia(){

        System.out.println("Metodo Obter autonomia foi chamado! ");
        return capCombustivel * consumoCombustivel;
    }

    private  double divideKMporConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }
    public double calcularCombustivel(double km){

        return this.divideKMporConsumoCombustivel(km);
    }
}
