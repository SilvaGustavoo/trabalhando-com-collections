package collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
    Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }


    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }


    public void removerProduto(long cod) {
        if(estoqueProdutos.containsKey(cod)){
            estoqueProdutos.remove(cod);
            System.out.println("O produto de código " + cod + " foi removido com sucesso.");
        } else{
            System.out.println("O produto de código " + cod + " não existe no estoque.");
        }
        
    }


    public Map<Long, Produto> exibirProdutos() {
        return estoqueProdutos;
    }


    public double calcularValorTotalEstoque() {
        double total = 0;
        for (Produto produto : estoqueProdutos.values()) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }


    public Produto obterProdutoMaisCaro() {
        double maiorPreco = 0;
        Produto produtoMaisCaro = null;

        for (Produto produto : estoqueProdutos.values()) {
            if(produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }

        return produtoMaisCaro;
    }


    public Produto obterProdutoMaisBarato() {
        Double menorPreco = null;
        Produto produtoMaisBarato = null;

        for (Produto produto : estoqueProdutos.values()) {
            if(menorPreco == null) {
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
            }
            if(produto.getPreco() < menorPreco) {
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }

        return produtoMaisBarato;
    }


    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        double maior = 0;
        Produto produtoMaior = null;

        for (Produto produto : estoqueProdutos.values()) {
            double total = produto.getPreco() * produto.getQuantidade();
            if(total > maior) {
                maior = total;
                produtoMaior = produto;
            }
        }

        return produtoMaior;

    }


    

    @Override
    public String toString() {
        return "\n" + estoqueProdutos + " ";
    }


    public static void main(String[] args) {
        
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(123456, "Notebook", 1, 2500.0);
        estoque.adicionarProduto(234567, "Mouse", 5, 150.0);
        estoque.adicionarProduto(345678, "Teclado", 10, 300.0);

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());

        System.out.println("Produto com maior quantidade e valor total no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

        estoque.removerProduto(234567);
        System.out.println(estoque.exibirProdutos());


    }
    
}
