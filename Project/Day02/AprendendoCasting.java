public class AprendendoCasting {

    public static void main(String[] args) {
        // Casting é o processo de transformação de variáveis.

        double resultado = 10.2;
        int resultadoInt = (int) resultado; // Aqui ele vai tirar após o ponto e deixá-lo como inteiro

        String meuString = "10";
        int meuInt = Integer.parseInt(meuString); // Convertendo para inteiro


        System.out.println(resultado); // Aqui vai mostrar o valor inicial
        System.out.println(resultadoInt); // Aqui vai mostrar o valor convertido
    }
}
