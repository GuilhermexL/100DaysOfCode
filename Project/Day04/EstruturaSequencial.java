import java.util.Scanner;

// Estruturas sequenciais seguem a ordem do código, linha por linha. São usadas para declarações de variáveis, cálculos, entrada e saída de dados.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Operações matemáticas
        double soma = num1 + num2;
        double media = (num1 + num2) / 2;

        // Exibição dos resultados
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
