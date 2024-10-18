package collections.list.operacoesBasicas;

public class Main {
    public static void main(String[] args) {

        // Cria uma lista de tarefas

        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Ler livro");
        lista.adicionarTarefa("Tomar café");

        lista.removerTarefa("Tomar café");

        System.out.println("Número total de tarefas: " + lista.obterNumeroTotalTarefas());
        System.out.println("Descrições das tarefas:");
        System.out.println(lista.obterDescricoesTarefas());

        System.out.println("\nCARRINHO DE COMPRAS\n");

        // Cria um Carrinho de Compras e seus itens

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Caneta", 2.50, 1);
        carrinho.adicionarItem("Lápis", 1.00, 1);
        carrinho.adicionarItem("Borracha", 0.50, 1);
        carrinho.adicionarItem("Borracha", 1.50, 2);

        // adicionado mais quantidades de um mesmo produto
        carrinho.adicionarItem("Caneta", 2.50, 3);
        carrinho.adicionarItem("Caneta", 2.50, 2);

        // Remove um item do carrinho
        carrinho.removerItem("Lápis");
        carrinho.removerItem("Lapiseira");
        System.out.println(" ");

        
        System.out.println("Itens do carrinho:");
        carrinho.exibirItens();
        System.out.println("Total do carrinho: R$ " + carrinho.calcularValorTotal());


        System.out.println("\n");
        System.out.println(carrinho);
        

    }
}
