import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Exemplo 02:
        * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.printf("Quantos numeros vc vai digitar: ");
        n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.printf("Numeros negativos: ");

        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }

        scanner.close();
    }
}
