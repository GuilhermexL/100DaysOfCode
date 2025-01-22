import entidade.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fazer um programa que leia medidas dos lados de dois triângulos X e Y
        // e mostre o valor das áreas dos dois triângulos e dizer qual possui maior área.

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        entidade.Triangulo x, y; // Importando a classe Triangulo para o Main.

        x = new Triangulo(); // Apontando o endereço "Alocação Dinâmica"
        y = new Triangulo(); // Atribuindo Objetos, instanciando em memória.

        System.out.println("Insira medidas do triangulo X: ");

        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Insira medidas do triangulo Y: ");

        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area(); // Instancio os métodos atribuídos para realizar o cálculo
        double areaY = y.area();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A maior área é o triângulo X." );
        } else {
            System.out.println("A maior área é o triângulo Y." );
        }

        scanner.close();

    }
}