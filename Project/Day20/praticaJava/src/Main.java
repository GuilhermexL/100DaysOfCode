import entities.Carro;
import entities.CarroEsportivo;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        CarroEsportivo meuCarroEsportivo = new CarroEsportivo();

        meuCarro.setModelo("Fusca");
        meuCarroEsportivo.setModelo("Ferrari");

        // No polimorfismo, ambos são carros, mas se comportam de forma diferente.

        testarCarro(meuCarro);
        testarCarro(meuCarroEsportivo);
    }
    public static void testarCarro(Carro carro) {
        carro.ligar();
        carro.acelerar(50);
        carro.frear(20);
        carro.desligar();
    }
}
