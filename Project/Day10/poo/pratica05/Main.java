import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Main {
    public static void main(String[] args) {

        // Criar um programa que converta um valor em dólar para real, considerando IOF de 6%.
        // O programa pergunte qual o valor do dólar atual e quanto o usuário possui, e mostrar quanto ficaria em reais.

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor do Dólar: $ ");
        double cambio = scanner.nextDouble(); // Como as subclasses são 'static' não preciso instanciar o arquivo.
                                              // Conversor conversor = new Conversor(); *Não precisa*
        System.out.print("Quantos dólares você possui: $ ");
        double dollar = scanner.nextDouble();

        System.out.printf(
                "Valor em reais = R$ %.2f",
                Conversor.valorFinal(cambio, dollar));

        scanner.close();
    }
}