public class DesafioFor {

    public static void main(String[] args){
        // Imprimir árvore de "#"

//        String valor = "#";
//        for(int i= 1; i <= 5; i++){
//            System.out.println(valor);
//            valor += "#";
//        }

        // Imprimindo árvore de "#" sem usar número
        for (String v = "#"; !v.equals("#####"); v += "#"){
            System.out.println(v);
        }

    }
}
