import entidade.Retangulo;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    // Fazer um programa que leia valores de altura e largura de um retângulo. E mostrar na tela
    // o valor de sua área, perímetro e diagonal. Aplicar estudos em POO.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Insira a altura e largura do retângulo");

        System.out.println();

        System.out.printf("Insira a altura: ");
        retangulo.altura = scanner.nextDouble();

        System.out.printf("Insira a largura: ");
        retangulo.largura = scanner.nextDouble();

        System.out.println("---------------------------------");

        System.out.print(retangulo);

        scanner.close();
    }
}