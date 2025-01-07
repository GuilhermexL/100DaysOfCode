import java.util.Scanner;

public class DesafioWhile5 {

    public static void main(String[] args) {

        // Escrever um código que faça a adição dos números que seja inseridos

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valores para efetuarmos adição, quando desejar obter o resultado, digite 0: ");

        int valor = scanner.nextInt();

        int soma = 0;

        while (valor != 0){
            soma += valor; // soma = soma + valor;
            valor = scanner.nextInt();
        }

        System.out.println("A soma efetuada é igual a: " + soma);

        scanner.close();
    }
}
