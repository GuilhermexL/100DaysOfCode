import java.util.Scanner;

public class DesafioWhile2 {

    public static void main(String[] args) {
        // Faça um programa que imprima na tela a soma dos 10 primeiros números naturais

        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        while (contador < 10){
            soma += contador;
            contador++;
        }
        System.out.println("A soma dos 10 primeiros naturais é: " + soma);
    }
}
