public class ConversaoTipos {

    public static void main(String[] args){

        // Casting é a ferramenta usada para realizar conversões explícitas
        // Conversão de tipos inclui tanto conversões implícitas quanto explícitas.

        double decimal = 9.7;
        int inteiro = (int) decimal; // Aqui usamos casting
        System.out.println(inteiro); // Saída: 9 (trunca a parte decimal)


        int num = 10;
        double decimal = num; // Conversão implícita
        System.out.println(decimal); // Saída: 10.0 (trunca a parte decimal)

    }
}
