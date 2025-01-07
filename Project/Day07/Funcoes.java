public class Funcoes {
    public static void main(String[] args) {
        // Funções representam um processamento que possui significado, sua vantagem é ser bem modulada.
        // Ela pode ou não retornar uma saída.

        // Assim, em Orientação à Objetos, funções em classes recebem o nome de métodos.

        // Exemplo - Um programa que leia 3 número e informe qual o maior

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 3 valores: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = max(a, b, c);

        resultado(maior);

        scanner.close();
    }
    // Quero fazê-lo uma função

    public static int max(int x, int y, int z){
        int auxiliar;
        if (x > y && x > z){
            auxiliar = x;
        } else if (y > z){
            auxiliar = y;
        } else {
            auxiliar = z;
        }
        return auxiliar;
    }

    public static void resultado(int valor){
        System.out.println("Maior = " + valor);
    }
}
