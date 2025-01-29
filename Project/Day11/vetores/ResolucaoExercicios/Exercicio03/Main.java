import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Exemplo 03:
        * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        * - Imprimir todos os elementos do vetor
        * - Mostrar na tela a soma e a média dos elementos do vetor */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.printf("Quantos numeros vc vai digitar: ");
        n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        media = soma / n;

        System.out.println("Valores Inseridos:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f\n", vetor[i]);
        }

        System.out.println();
        System.out.printf("Soma = " + soma);

        System.out.println();
        System.out.printf("Média: %.2f", media);

        scanner.close();
    }
}
