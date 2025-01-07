import com.sun.source.tree.IfTree;

public class OperadorTernario {

    public static void main(String[] args){

        boolean temDinheiro = false;
        boolean temCartao = false;

        String mensagem = (temDinheiro) ? "Pede um Ifood" : "Come oque tem em casa";
        System.out.println(mensagem);

        // Igual a

//        if (temDinheiro) {
//            System.out.println("Pede um Ifood");
//        }
//        else {
//            System.out.println("Come oque tem em casa");
//        }
    }
}
