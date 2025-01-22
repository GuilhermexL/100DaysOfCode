public class OperadoresAritmeticos {

    public static void main(String[] args){
        double pao = 9.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDiasDoMes = 30;

        double valorTotal = pao + queijo + acucar; // Adição
        double valorTotalComDesconto = valorTotal - desconto; // Subtração
        double valorTotalDividido = valorTotalComDesconto / 2; // Divisão
        double valorTotalMensal = valorTotalComDesconto * totalDiasDoMes; // Multiplicação

        // Outro método é o resto que é muito pouco utilizado que é pelo símbolo "%"

        System.out.println("Valor Total: R$ " + valorTotal);
        System.out.println("Valor Total com Desconto: R$ " + valorTotalComDesconto);
        System.out.println("Valor Total Dividido por dois: R$ " + valorTotalDividido);
        System.out.println("Valor Total Mensal: R$ " + valorTotalMensal);
    }
}
