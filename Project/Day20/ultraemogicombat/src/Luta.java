/* A classe abaixo representa uma função de agregação da classe Lutador */

import java.util.Objects;
import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Getters e Setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // Métodos Públicos

    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (Objects.equals(lutador1.getCategoria(), lutador2.getCategoria())
                && lutador1 != lutador2) {
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("----- Desafiado -----");
            this.desafiado.apresentar();

            System.out.println("----- Desafiante -----");
            this.desafiante.apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);

            System.out.println("---------- RESULTADO ----------");
            switch (vencedor) {
                case 0: // Luta empata
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1: // Desafiado Vence
                    System.out.println("Vitória do " + this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: // Desafiante Vence
                    System.out.println("Vitória do " + this.desafiante);
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

            System.out.println("---------- XXXXX ----------");

        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
}