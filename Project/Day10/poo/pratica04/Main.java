import entidade.Estudante;

import javax.print.attribute.standard.Media;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    /* Fazer um programa que leia o nome do aluno e suas 3 notas ao longo do ano sendo que
    * no primeiro trimestre vale 30 e 35 cada no restante. Após ler as notas informar a média e
    * mostrar se passou ou não, em caso de não aprovação mostrar quantos pontos
    * faltam para ser aprovado, considerando a média 60. */


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.printf("Insira seu nome: ");
        estudante.nome = scanner.nextLine();

        estudante.nota1 = scanner.nextDouble();
        estudante.nota2 = scanner.nextDouble();
        estudante.nota3 = scanner.nextDouble();

        double media = estudante.Media();

        System.out.println(estudante);

        if (media > 60){
            System.out.println("APROVADO");
        } else {

            System.out.println("REPROVADO");
            System.out.println("VOCÊ PRECISA DE " + String.format("%.2f", 60 - media) + " PONTOS");
        }

        scanner.close();
    }
}