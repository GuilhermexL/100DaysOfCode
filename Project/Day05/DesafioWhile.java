import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args){
        // O programa pede para imprimir a media de alunos utilizando while.

        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US); // Força o uso de ponto decimal;

        int quantidadeNotas = 0;
        double nota = 0;
        double total = 0;

        while (true) {
            System.out.print("Informe a nota (ou -1 para sair): ");
            nota = scanner.nextDouble();

            if (nota == -1) { // Condição de saída
                break;
            }

            if (nota <= 10 && nota >= 0) { // Validando a nota
                total += nota;
                quantidadeNotas++;
            } else {
                System.out.println("Nota inválida");
            }
        }

        if (quantidadeNotas > 0) { // Verifica se há notas válidas
            double media = total / quantidadeNotas;
            System.out.println("Sua média é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi informada.");
        }
    }
}
