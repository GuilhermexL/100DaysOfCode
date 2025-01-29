import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Vetores, é o nome dado à arranjos unidimensionais

        /* Vamos direto a um exemplo:
        * Fazer um programa que leia um número inteiro N e a altura de N pessoas.
        * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas. */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            vect[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++){
            soma += vect[i];
        }
        double media = soma / n;

        System.out.printf("Média de altura: %.2f%n", media);

        scanner.close();
    }
}
