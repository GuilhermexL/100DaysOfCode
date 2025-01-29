package entities;

public class Conta {

    private int numero;
    private String titular;
    private double total;

    // Adicionando Construtores

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);
    }

    // Inserindo Getters e Setters

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double gettotal() {
        return total;
    }

    // Inserindo termos de saque e depósito

    public void deposito(double quantia){
        total += quantia;
    }

    public void saque(double quantia){
        total -= quantia + 5.0; // Aplicando o juros de 5 para cada saque
    }

    public String toString(){
        return "Conta "
                + numero
                + ", Titular: "
                + titular
                + ", Balanço: R$ "
                + String.format("%.2f", total);
    }
}