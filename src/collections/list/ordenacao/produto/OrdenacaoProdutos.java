package collections.list.ordenacao.produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoProdutos {
    
    private List<Produtos> list_produtos;

    public OrdenacaoProdutos() {
        this.list_produtos = new ArrayList<>();
    }

    public void addProduto(Produtos produto) {
        this.list_produtos.add(produto);
    }

    public List<Produtos> getProdutosOrdenadosPorPreco() {
        List<Produtos> listaOrdenada = new ArrayList<>(list_produtos);
        // listaOrdenada.sort(Comparator.comparing(Produtos::getPreco));
        Collections.sort(listaOrdenada, new ComparatorPreco());
        return listaOrdenada;
    }

    public List<Produtos> getProdutosOrdenadosPorNome() {
        List<Produtos> listaOrdenada = new ArrayList<>(list_produtos);
        // listaOrdenada.sort(Comparator.comparing(Produtos::getNome));
        Collections.sort(listaOrdenada, new ComparatorNomeProduto());
        return listaOrdenada;
    }

    public List<Produtos> getProdutosOrdenadosPorCodBarra() {
        List<Produtos> listaOrdenada = new ArrayList<>(list_produtos);
        // listaOrdenada.sort(Comparator.comparing(Produtos::getCodBarra));
        Collections.sort(listaOrdenada, new ComparatorCodBarras());
        return listaOrdenada;
    }

    public static void main(String[] args) {
        
        OrdenacaoProdutos lista = new OrdenacaoProdutos();

        Produtos produto1 = new Produtos("Notebook", 2500.0, "1234567890123");
        Produtos produto2 = new Produtos("Mouse", 150.0, "9876543210987");
        Produtos produto3 = new Produtos("Teclado", 300.0, "3456789012345");

        lista.addProduto(produto1);
        lista.addProduto(produto2);
        lista.addProduto(produto3);

        System.out.println("Bom diaa \n\n");

        System.out.println("Produtos ordenados por preço:" + lista.getProdutosOrdenadosPorPreco());
        System.out.println(" ");
        System.out.println("Produtos ordenados por código de barras:" + lista.getProdutosOrdenadosPorCodBarra());
        System.out.println(" ");
        System.out.println("Produtos ordenados por nome:" + lista.getProdutosOrdenadosPorNome());
        System.out.println(" ");
        
        
    }

}
