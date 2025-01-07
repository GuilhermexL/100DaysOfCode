import java.util.Scanner;
public class EstruturaCondicional {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, digite a sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 18) { // Lê-se : 'Se idade for maior ou igual à 18 imprima(System.out)'
            System.out.println("Olá, " + nome + " você está APTO com idade de " + idade + " anos, para se juntar ao Exército Brasileiro!");
        } else { // Lê-se : 'Se não(System.out)'
            System.out.println("Olá, " + nome + " com idade de " + idade + " anos, você está INAPTO para se juntar ao Exército Brasileiro!");
        }
    }
}
