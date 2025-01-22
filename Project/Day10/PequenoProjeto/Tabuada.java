import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args){
        // Programa que imprime uma tabuada de acordo com o número fornecido pelo usuário.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt(); // Recebe o número do usuário

        for (int cont = 1; cont <= 10; cont++){ // Faz o calculo de 1 a 10.
            System.out.println( numero + " x " + cont + " = " + (numero * cont)); // Mostra na tela o resultado do valor inserido pelo usuário
        }

    }
}
