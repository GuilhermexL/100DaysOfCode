public class Lutador {

    // Atributos

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    // Construtor

    public String toString() {
        return this.getNome();
    }

    public Lutador(String nome, String nacionalidade,
                   int idade, double altura, double peso,
                   int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // Métodos públicos

    public void apresentar(){
        System.out.println("---------- Dados do Lutador ----------");
        System.out.println("Lutador: " + this.getNome()
                            + "\nNacionalidade: " + this.getNacionalidade()
                            + "\nIdade: " + this.getIdade() + " anos"
                            + "\nAltura: " + this.getAltura() + " m"
                            + "\nPeso: " + this.getPeso() + " kg"
                            + "\nCategoria: " + this.getCategoria()
                            + "\nVitorias: " + this.getVitorias() + " vezes"
                            + "\nDerrotas: " + this.getDerrotas() + " vezes"
                            + "\nEmpates: " + this.getEmpates() + " vezes");

    }

    public void status(){
        System.out.println("---------- Lutador ----------");
        System.out.println(getNome()
                            + " é um peso " + this.getCategoria()
                            + "\nGanhou: " + this.getVitorias() + " vezes"
                            + "\nPerdeu: " + this.getDerrotas() + " vezes"
                            + "\nEmpatou: " + this.getEmpates() + " vezes");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
