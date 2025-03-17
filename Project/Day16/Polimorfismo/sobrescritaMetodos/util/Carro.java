package util;

// Subclasse Carro
public class Carro extends Veiculo {
    @Override
    public void ligar() {
        System.out.println("O carro está ligando com um motor mais potente..."); // Sobrescrever oque a classe base
    }
}