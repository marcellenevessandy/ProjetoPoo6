package br.ulbra.poo;

public class Animal {
    private String nome;
    private String sexo;
    private int quantPatas;
    private int quantidade;
    private double peso;
    private double altura;
    private boolean ehRaivoso;
    private boolean ehCastrado;

    public Animal() {
    }

    public Animal(String nome, String sexo, int quantPatas, int quantidade, double peso, double altura, boolean ehRaivoso, boolean ehCastrado) {
        this.nome = nome;
        this.sexo = sexo;
        this.quantPatas = quantPatas;
        this.quantidade = quantidade;
        this.peso = peso;
        this.altura = altura;
        this.ehRaivoso = ehRaivoso;
        this.ehCastrado = ehCastrado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getQuantPatas() {
        return quantPatas;
    }

    public void setQuantPatas(int quantPatas) {
        this.quantPatas = quantPatas;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isEhRaivoso() {
        return ehRaivoso;
    }

    public void setEhRaivoso(boolean ehRaivoso) {
        this.ehRaivoso = ehRaivoso;
    }

    public boolean isEhCastrado() {
        return ehCastrado;
    }

    public void setEhCastrado(boolean ehCastrado) {
        this.ehCastrado = ehCastrado;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", sexo=" + sexo + ", quantPatas=" + quantPatas + ", quantidade=" + quantidade + ", peso=" + peso + ", altura=" + altura + ", ehRaivoso=" + ehRaivoso + ", ehCastrado=" + ehCastrado + '}';
    }
    
    
}