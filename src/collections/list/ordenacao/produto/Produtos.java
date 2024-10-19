package collections.list.ordenacao.produto;

import java.util.Comparator;

public class Produtos {
    
    private String nome;
    private double preco;
    private String codBarra;

    public Produtos(String nome, double preco, String codBarra) {
        this.nome = nome;
        this.preco = preco;
        this.codBarra = codBarra;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    @Override
    public String toString() {
        return "\n nome=" + nome + ", preco=" + preco + ", codBarra=" + codBarra + "";
    }

    

}

class ComparatorNomeProduto implements Comparator<Produtos> {

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return p1.getNome().compareTo(p2.getNome());
    }

}

class ComparatorPreco implements Comparator<Produtos> {

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}

class ComparatorCodBarras implements Comparator<Produtos> {

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return p1.getCodBarra().compareTo(p2.getCodBarra());
    }

}