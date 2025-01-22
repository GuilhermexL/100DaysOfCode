import java.util.Scanner;

public class DesafioWhile6 {

    public static void main(String[] args) {
        // Escrever um programa que repita a leitura de uma senha até que ela seja válida. Para casa leitura de senha incorreta informada,
        // escrever a mensagem "Senha inválida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
        // e o algoritmo encerrado. Considere que a senha correta é o valor 2022.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira sua Senha: ");
        int senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso Permitido");

    }}