import java.util.Locale;
import java.util.Scanner;

public class QuestaoDoWhile1 {

    // Questão pede para converter Celsius em Fahrenheit utilizando o método Do while

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        char resposta;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir (s/n)? ");
            resposta = scanner.next().charAt(0);
        }while (resposta != 'n'); // Se não for clicado "n" volta a ser executado

    }
}
