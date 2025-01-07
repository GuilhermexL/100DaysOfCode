import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args){

        // A questão pede para escrever um programa que receba um número inteiro e informe se é par ou ímpar.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor = scanner.nextInt(); // Recebe o número inteiro

        System.out.println(valor % 2 == 0 ? "O número é PAR!" : "O número é ÍMPAR!");

        // OU

//        if (valor % 2 == 0) {
//            System.out.println("O número é PAR!");
//
//        } else {
//            System.out.println("O número é ÍMPAR!");
//        }
    }
}
