import util.Carro;
import util.Moto;
import util.Veiculo;

public class Main {
    public static void main(String[] args) {

        util.Veiculo meuVeiculo;

        meuVeiculo = new Carro();
        meuVeiculo.ligar(); // Chama o método sobrescrito em Carro

        meuVeiculo = new Moto();
        meuVeiculo.ligar(); // Chama o método sobrescrito em Moto
    }
}