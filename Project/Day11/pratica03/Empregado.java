package entidade;

public class Empregado {

    public String nome;
    public double salario;
    public double imposto;

    public double salarioLiquido() {
        return salario - imposto;
    }

    public void aumentoSalarial(double porcentagem) {
        salario += salario * porcentagem / 100.0;
    }

    public String toString() {
        return nome + ", R$ " + String.format("%.2f", salarioLiquido());
    }

}
