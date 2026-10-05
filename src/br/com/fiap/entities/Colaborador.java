package br.com.fiap.entities;

public class Colaborador {

    // visibilidade, tipo de dados e atributo
    private int numeroRegistro;
    private String nome;
    private String setor;
    private double salario;
    private Endereco endereco; // atributo de referencia

    // metodo construtor com parametro vazio
    public Colaborador() {
    }

    // metodo construtor com parametro cheio, mas sem atributo de referencia
    public Colaborador(int numeroRegistro, String nome, String setor, double salario) {
        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    // metodos getters e setters
    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n\nColaborador " +
                "\nnumero de registro = " + numeroRegistro +
                "\nnome = '" + nome + '\'' +
                "\nsetor = '" + setor + '\'' +
                "\nsalario = " + salario + endereco;
    }
}
