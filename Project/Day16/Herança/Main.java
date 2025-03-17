import util.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo.Carro carro = new Veiculo.Carro();
        Veiculo.Moto moto = new Veiculo.Moto();

        carro.marca = "Chevrolet";
        carro.modelo = "Onix";
        carro.ano = 2025;
        carro.portas = 4;

        moto.marca = "Honda";
        moto.modelo = "CB1000";
        moto.ano = 2025;

        carro.ligar(); // Método herdado da classe Veículo
        carro.exibirDetalhes(); // Método da própria classe Carro

        System.out.println("----------------------");

        moto.ligar();
        moto.detalhes();
    }
}
