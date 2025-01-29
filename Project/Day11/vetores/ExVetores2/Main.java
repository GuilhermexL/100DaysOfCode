import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {
    public static void main(String[] args) {

        /* Exemplo 02:
        * Fazer um programa que leia um número inteiro N e os dados (nome e preço) de
        * N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos. */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++) {
            scanner.nextLine();
            String nome = scanner.nextLine();
            double preco = scanner.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco();
        }

        double media = soma / vect.length;

        System.out.printf("Média de Preço: %.2f%n", media);

        scanner.close();
    }
}
