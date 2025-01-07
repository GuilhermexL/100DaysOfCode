import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número correspondente ao dia da semana: ");

        String dia = scanner.nextLine();

        if ("domingo".equalsIgnoreCase(dia)){
            System.out.println(1);
        } else if ("segunda".equalsIgnoreCase(dia)){
            System.out.println(2);
        }else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
            System.out.println(3);
        }else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println(4);
        }else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println(5);
        }else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println(6);
        }else if ("sábado".equalsIgnoreCase(dia)) {
            System.out.println(7);
        }else {
            System.out.println("Dia inválido!");
        }

        System.out.println("O número correspondente ao dia digitado é o: " + dia);

    }
}
