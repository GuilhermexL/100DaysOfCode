import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args){
        // A questão pede para receber 3 valores e informa-los qual o maior e o menor entre eles

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 3 valores para começarmos.");

        System.out.println("Primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.println("Terceiro valor: ");
        int valor3 = scanner.nextInt();

        int maior = valor1;
        int menor = valor1;

        if (valor2 > maior){
            maior = valor2;
        }
        if (valor3 > maior){
            maior = valor3;
        }

        // Verificando menor valor

        if (valor2 < menor) {
            menor = valor2;
        }
        if (valor3 < menor){
            menor = valor3;
        }

        System.out.println("Os valores fornecidos foram: " + valor1+ ", " + valor2 +", "+ valor3 + ".");

        System.out.println("O maior número: " + maior);
        System.out.println("O menor número: " + menor);

    }
}
