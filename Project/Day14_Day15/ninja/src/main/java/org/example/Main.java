package org.example;

import org.example.classes.NinjaAvancado;
import org.example.classes.NinjaBasico;
import org.example.enums.TipoHabilidade;

public class Main {
    public static void main(String[] args) {

        NinjaBasico ninja1 = new NinjaBasico("Naruto", "Autoreplicação", 14, TipoHabilidade.NINJUTSU);
        ninja1.mostrarInformacoes();
        ninja1.executarHabilidade();

        NinjaAvancado ninja2 = new NinjaAvancado("Sasuke", "Clonar habilidades do oponente", "Poder da Fúria", 18, TipoHabilidade.GENJUTSU);
        ninja2.mostrarInformacoes();
        ninja2.executarHabilidade();
        ninja2.habilidadeEspecial();

        NinjaAvancado ninja3 = new NinjaAvancado("Rocky Lee", "Ataque Veloz", "Efetuar golpes não perceptíveis", 16, TipoHabilidade.TAIJUTSU);
        ninja3.mostrarInformacoes();
        ninja3.executarHabilidade();
        ninja3.habilidadeEspecial();

        NinjaBasico ninja4 = new NinjaBasico("Boruto", "Explosão de Fúria", 10, TipoHabilidade.KATON);
        ninja4.mostrarInformacoes();
        ninja4.executarHabilidade();
    }
}