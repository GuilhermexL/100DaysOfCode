package entidade; // Pacote da Classe

public class Triangulo { // Criando a classe, definição do tipo

    public double a; // Tipo 'Public' informa que ele pode ser acessado por outro arquivo (Método e Atributo)
    public double b; // Declarando atributos da classe
    public double c;

    // Criando um método que calcule a função

    public double area() { // Aqui estou implementando o método que calcula a área do triangulo.
        double p = (a + b + c) / 2.0; // Aqui e na próxima linha, atribou o método a ser usado.
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        // Usamos métodos para eliminarmos repetição de códigos e delegação de responsabilidades (coesão).
        // OBS: o tipo de dado que está 'double', se por acaso o método não retornar nada, usa-se, 'void'.
    }

}
