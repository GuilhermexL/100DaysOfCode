package org.example.classes;

import org.example.enums.TipoHabilidade;
import org.example.interfaces.Ninja;

public class NinjaAvancado implements Ninja {

    // Atributos

    private String nome, habilidade, especialidade;
    private int idade;
    private TipoHabilidade tipoCombate;

    // Construtores

    public NinjaAvancado(String nome, String habilidade, String especialidade, int idade, TipoHabilidade tipoCombate) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.idade = idade;
        this.tipoCombate = tipoCombate;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos Personalizados

    @Override
    public void mostrarInformacoes() {
        Ninja.super.mostrarInformacoes();
        System.out.println("========== DADOS DO NINJA ==========");
        System.out.println("Nome: " + getNome()
                            + "\nIdade: " + getIdade() + " anos"
                            + "\nTipo de Luta: " + tipoCombate.getDescricao());
    }

    @Override
    public void executarHabilidade() {
        Ninja.super.executarHabilidade();
        System.out.println("O ninja, " + getNome() + ", está executando sua habilidade de " + getHabilidade());
    }

    public void habilidadeEspecial() {
        System.out.println("O ninja, " + getNome() + ", tem a especialidade de " + getEspecialidade());
    }
}
