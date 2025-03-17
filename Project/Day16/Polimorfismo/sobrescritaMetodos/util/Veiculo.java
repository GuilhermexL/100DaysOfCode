package util;

/*
    Nesse caso estou aplicando a particularidade Sobrescrita de método
    Que a subclasse modifica o comportamento de um método herdado da superclasse.
*/

/*
    OBS: Como em Java só é permitido existir uma classe pública por arquivo, vamos criar uma classe
    para cada tipo de veículo.
*/

// Classe base
public class Veiculo {
    public void ligar() {
        System.out.println("O veículo está ligando...");
    }
}