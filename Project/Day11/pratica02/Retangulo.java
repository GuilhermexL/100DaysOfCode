package entidade;

public class Retangulo {

    public double largura;
    public double altura;

    public double Area() {
        return altura * largura;
    }

    public double Perimetro() {
        return (largura * 2) + (altura * 2);
    }

    public double Diagonal() {
        return Math.sqrt((altura * altura) + (largura * largura));
    }

    public String toString() {
        return "Área: " + Area() + "\nPerímetro: " + Perimetro() + "\nDiagonal: " + Diagonal();
    }
}
