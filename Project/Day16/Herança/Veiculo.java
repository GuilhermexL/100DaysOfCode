package util;

// Praticando Herança: Onde uma classe 'Filha' ou Subclasse, herda atributos ou métodos de uma
// classe 'pai' ou superclasse.

public class Veiculo { // Atribundo classe principal
    public String marca;
    public String modelo;
    public int ano;

    public void ligar() {
        System.out.println("O veículo está ligado!");
    }

    public static class Carro extends Veiculo { // Usando o 'extends' para herdar métodos ou atributos da superclasse
        public int portas;

        public void exibirDetalhes() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Portas: " + portas);
        }
    }

    public static class Moto extends Veiculo {
        public void detalhes() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
        }
    }
}
