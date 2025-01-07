public class TrabalhandoComStrings {

    public static void main(String[] args){


        String nome = "Guilherme";
        String sobrenome = "Santos";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(sobrenome);
        String nomeCompleto = nome.concat(sobrenome);


        System.out.println("Olá " + nome);
        System.out.println("Olá " + nome + ", seu nome tem " + tamanhoString + " caracteres.");
        System.out.println("Os nomes são iguais: " + saoIguais);
        System.out.println("Olá " + nomeCompleto);

    }
}
