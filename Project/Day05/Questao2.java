import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args){
        // A questão pede para imprimir uma tabuada de acordo com o número fornecido pelo usuário

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt(); // Recebe o número do usuário

        for (int cont = 1; cont <= 10; cont++){
            System.out.println( numero + " x " + cont + " = " + (numero * cont));
        }

    }
}
