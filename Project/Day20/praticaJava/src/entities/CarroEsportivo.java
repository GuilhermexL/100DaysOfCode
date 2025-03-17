package entities;

public class CarroEsportivo extends Carro {

    // Novo atributo específico de CarroEsportivo
    private boolean turbo;

    // Novo método específico de CarroEsportivo
    public void ativarTurbo(){
        if (turbo) {
            System.out.println("Turbo já está ativado!");
        } else {
            turbo = true;
            System.out.println("Turbo ativado!");
        }
    }

    // Sobrescrevendo um método da Classe Carro
    @Override
    public void acelerar(int incremento) {
        if (turbo) {
            incremento *= 2; // Com turbo, o carro acelera o dobro
        }
        super.acelerar(incremento);
    }
}
