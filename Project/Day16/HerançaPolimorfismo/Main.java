import util.Animal;
import util.Cachorro;
import util.Gato;

/*
* Nesse exemplo utilizo os conhecimentos aplicados a herança e polimorfismo
* E estruturação de arquivos
* */

public class Main {
    public static void main(String[] args) {

        Animal meuAnimal;

        meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Cachorro sobrescreve fazerSom

        meuAnimal = new Gato();
        meuAnimal.fazerSom(); // Gato sobrescreve fazerSom
    }
}