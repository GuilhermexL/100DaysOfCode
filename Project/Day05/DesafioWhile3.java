import java.util.Scanner;

public class DesafioWhile3 {

    public static void main(String[] args) {
        // Faça um programa que leia um número e multiplique o resultado por 2 até o número passar 100.

        Scanner scanner = new Scanner(System.in);

        int valor = 0;

        // Validando entrada

        while (valor < 1 || valor > 100){
            System.out.print("Digite um valor entre 0 e 100: ");
            valor = scanner.nextInt();
        }

        while (valor < 100){
            System.out.println(valor);
            valor *= 2;
        }
    }
}
