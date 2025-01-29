import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        /*  Exemplo 04:
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
        Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem
        de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver. */

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = scanner.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++){

            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = scanner.next();
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();
            System.out.print("Altura: ");
            altura[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
        }

        double mediaAlturas = soma / n;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                contador += 1;
            }
        }

        double porcentagem = (contador * 100.0) / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", porcentagem);

        System.out.println();

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }

        scanner.close();
    }
}