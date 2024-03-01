package br.ulbra.poo;

/**
 *
 * @author aluno.saolucas
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private boolean ehCasado;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double peso, boolean ehCasado) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.ehCasado = ehCasado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEhCasado() {
        return ehCasado;
    }

    public void setEhCasado(boolean ehCasado) {
        this.ehCasado = ehCasado;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso +
                ", ehCasado=" + ehCasado + '}';
    }
    
    
}



