package entidade;

public class Estudante {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double Media() {
        return nota1 + nota2 + nota3;
    }

    public String toString() {
        return "Nota Final: " + String.format("%.2f" ,Media());
    }
}
