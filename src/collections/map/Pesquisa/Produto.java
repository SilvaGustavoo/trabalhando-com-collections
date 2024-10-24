package collections.map.Pesquisa;

import collections.map.Ordenacao.Livro;

public class Produto implements Comparable<Livro> {
    
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "{\n nome: " + nome + ",\n preco: " + preco + ",\n quantidade: " + quantidade + " }\n";
    }

    @Override
    public int compareTo(Livro o) {
        return Double.compare(preco, o.getPreco());
    }

    
}
