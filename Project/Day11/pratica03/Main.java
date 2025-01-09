import entidade.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    // Fazer um programa que leia os dados de um funcionário e retorne seus dados
    // e em seguida, aumentar o seu salário baseado na porcentagem inserida. E imprimir
    // os dados atualizados com o novo salário.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Empregado empregado = new Empregado();

        System.out.printf("Seu nome: ");
        empregado.nome = scanner.nextLine();

        System.out.printf("Seu salário bruto: ");
        empregado.salario = scanner.nextDouble();

        System.out.printf("Insira quanto você paga de impostos: ");
        empregado.imposto = scanner.nextDouble();

        System.out.println();

        System.out.println("Empregado: " + empregado);

        System.out.println();

        System.out.print("Você terá acréscimo salarial de quantos %: ");
        double porcentagem = scanner.nextDouble();
        empregado.aumentoSalarial(porcentagem);

        System.out.println();

        System.out.println("Dados Atualizados: " + empregado);

        scanner.close();
    }
}