package collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        boolean itemEncontrado = false; 
        Item adicionarItem = new Item(nome, preco, quantidade);
        for (Item item : carrinho) {
            if(item.getNome().equalsIgnoreCase(nome) && item.getPreco() == adicionarItem.getPreco()) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                System.out.println("item adicionado com sucesso!");
                itemEncontrado = true;  // evita adicionar duplicados
                break;
            }
        }
        
        if(itemEncontrado == false) {
            carrinho.add(adicionarItem);
            System.out.println("item adicionado com sucesso!");
        }

    }

    public void removerItem(String nome) {
        boolean itemEncontrado = false;
        for (Item item : carrinho) {
            if(item.getNome().equals(nome)) {
                carrinho.remove(item);
                System.out.println("item removido com sucesso!");
                itemEncontrado = true;
                break;
            }
        }

        if(itemEncontrado == false) {
            System.out.println("Item não encontrado no carrinho!");
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : carrinho) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        for (Item item : carrinho) {
            System.out.println(item.getNome() + " - " + item.getPreco() + " x " + item.getQuantidade() + " un = R$ " + (item.getPreco() * item.getQuantidade()));
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras carrinho \n" + carrinho + "\n";
    }

    


    
    
}
