public class ArrayEListas{
    public static void main(String[] args) {

        // Aplicando estudos sobre o assunto

        // Arrays utilizar quando o número de elementos for conhecido e fixo.
        // Listas utilizar quando o número de elementos pode mudar dinamicamente.

        // Exemplo de Array

        // tipo[] nomeDoArray = new tipo[tamanho]; // Sua estrutura

        // Exemplo de Código
        //                       0          1         2         3         4...   Leitura de 'casas' em Arrays
        String[] pessoas = {'Guilherme', 'Helen', 'Betânia', 'Boris', 'Paçoca'}; // lista de nomes

        // OBS: Lembrar SEMPRE de usar aspas duplas nos arrays

        System.out.println(pessoas[4]); // Localiza e Imprime o nome na casa 4. 'Saída: Paçoca'

        // Percorrendo um array com laço FOR

        String[] pessoas = {"Guilherme", "Helen", "Betânia", "Boris", "Paçoca"};

        for (int i = 0; i < pessoas.length; i++){
            System.out.println(pessoas[i]);
        }

        // Ou usando o For-Each (Mais simples)

       String[] pessoas = {"Guilherme", "Helen", "Betânia", "Boris", "Paçoca"};

        for (String pessoa : pessoas) { // É uma forma simplificada de percorrer Arrays e Listas
            System.out.println(pessoa);
        }

        // Outro Exemplo

        int[] numeros = new int[5];     // Cria um array de inteiros com 5 posições
        numeros[0] = 10;                // Define o valor na posição 0
        numeros[1] = 20;                // Define o valor na posição 1
        System.out.println(numeros[0]); // Saída: 10 Nesse caso, se for colocado valor 2, 3... em diante o valor será 0

        // Listas
        // List<tipo> nomeDaLista = new ArrayList<>(); // Sua estrutura

        // Exemplo

        // OBS: No caso do Intellij importa sozinho, mas caso precise, deve importar as bibliotecas : import java.util.ArrayList e import java.util.List;

        List<String> nomes = new ArrayList<>();
        nomes.add("Ana"); // Adiciona elementos
        nomes.add("Carlos");
        nomes.add("João");
        System.out.println(nomes.get(1)); // Acessa o elemento na posição 1 (Saída: Carlos)

//         Métodos úteis em Listas

//         add(elemento): Adiciona um elemento à lista.
//         remove(indice): Remove o elemento na posição indicada.
//         size(): Retorna o tamanho da lista.
//         contains(elemento): Verifica se a lista contém o elemento.
//         clear(): Remove todos os elementos da lista.

        // OBS: Em caso de percorrer listas ou arrays e querer deletar algo é necessário o uso de um Iterador, como por exemplo:

        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("João");

        Iterator<String> it = nomes.iterator(); // Retorna um iterador para a coleção.
        while (it.hasNext()) { // Verifica se há mais elementos para iterar.
            String nome = it.next();
            if (nome.equals("Carlos")) { // Se encontrar um array com o valor igual à Carlos, remove.
                it.remove();  // Remove "Carlos" da lista enquanto percorre.
            }
        }

        System.out.println(nomes);  // Saída: [Ana, João]

        // Usando o FOR

        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("João");

        List<String> nomesRestantes = new ArrayList<>();
        for (String nome : nomes) {
            if (!nome.equals("Carlos")) {
                nomesRestantes.add(nome);  // Adiciona "Ana" e "João" na nova lista
            }
        }

        nomes = nomesRestantes;  // Substitui a lista original pela nova

        System.out.println(nomes);  // Saída: [Ana, João]

        // É mais indicado o uso do laço for

}}

