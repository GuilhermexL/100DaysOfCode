package entities;

public class Carro {

    private String cor;
    private String modelo;
    private int ano;
    private int velocidadeAtual;


    // Método público para acessar (Getters) e modificar (Setters) os atributos

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo(String modelo) {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Métodos de ação

    public void acelerar(int incremento){
        velocidadeAtual += incremento;
        System.out.println("Acelerando! Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear(int decremento){
        velocidadeAtual -= decremento;
        System.out.println("Freando! Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void ligar(){
        System.out.println("Carro ligado!");
    }

    public void desligar(){
        System.out.println("Carro desligado!");
    }

}
