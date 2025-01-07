import java.util.Scanner;

public class DesafioWhile4 {

    public static void main(String[] args) {
        // Faça um programa que leia dois números e imprima todos os números inteiros entre eles.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int contador = valor1 + 1;
        while (contador < valor2){
            System.out.println(contador);
            contador++;
        }
    }
}
