/*                                     Exercício de Fixação
* Crie um programa que realize o cadastro de uma conta, dado opções para que seja ou não
* informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque,
* sempre mostrando os dados da conta após cada operação.
* Lembrando que para cada saque é cobrado uma taxa de R$ 5. */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Conta conta;

        System.out.print("Insira o número de sua conta: ");
        int numero = scanner.nextInt();

        System.out.print("Insira o seu nome: ");
        scanner.nextLine();
        String titular = scanner.nextLine();

        System.out.print("Você vai inserir um deposito inicial (y/n)? ");
        char resposta = scanner.next().charAt(0);

        if (resposta == 'y'){
            System.out.print("Digite o valor inicial: R$ ");
            double depositoInicial = scanner.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }
        else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do depósito: R$ ");
        double valorDeposito = scanner.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println("Saldo atualizado:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do saque: R$ ");
        double valorSaque = scanner.nextDouble();
        conta.saque(valorSaque);

        System.out.println("Saldo atualizado:");
        System.out.println(conta);

        scanner.close();
    }
}