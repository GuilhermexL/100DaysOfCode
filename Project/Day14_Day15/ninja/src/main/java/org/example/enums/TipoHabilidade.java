package org.example.enums;

public enum TipoHabilidade {

    TAIJUTSU("Luta consistente em combates corpo a corpo"),
    NINJUTSU("Utiliza técnicas normais, que usam chakra para realizá-las"),
    GENJUTSU("Se baseia em ilusões. Nessecita de chakra, mas necessita de menos chakra do que um ninjutsu"),
    KATON("O Estilo Fogo é uma das cinco áreas elementares básicas da Mudança da Natureza"),
    RINNEGAN("Não se sabe muito, mas esse são os olhos do Eremita dos Seis Caminhos");

    private String descricao;

    // Construtores

    TipoHabilidade(String descricao) {
        this.descricao = descricao;
    }

    // Getter

    public String getDescricao() {
        return descricao;
    }
}
