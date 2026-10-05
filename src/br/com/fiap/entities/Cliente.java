package br.com.fiap.entities;

public class Cliente {

    // visibilidade, tipo de dados e atributo
    private String nome;
    private String rg;
    private int idade;
    private double altura;

    // metodo construtor com parametro vazio
    public Cliente() {
    }

    // metodo construtor com parametro cheio
    public Cliente(String nome, String rg, int idade, double altura) {
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.altura = altura;
    }

    // metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    @Override
    public String toString() {
        return "Cliente " +
                "\nnome =' " + nome + '\'' +
                "\nrg =' " + rg + '\'' +
                "\nidade = " + idade +
                "\naltura = " + altura;
    }
}
