package collections.map.Ordenacao;


import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LivrariaOnline {
    
    private Map<String, Livro> livraria;

    public LivrariaOnline() {
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        for (String link : livraria.keySet()) {
            Livro livro = livraria.get(titulo);

            if(livro.getTitulo().equals(titulo)){
                livraria.remove(link);
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String,Livro>> livroOrdenadoList = new ArrayList<>(livraria.entrySet());

        Collections.sort(livroOrdenadoList, new ComparatorPreco());

        Map<String, Livro> livroOrdenado = new LinkedHashMap<>();

        for (Map.Entry<String,Livro> entry : livroOrdenadoList) {
            livroOrdenado.put(entry.getKey(), entry.getValue());
        }

        System.out.println(livroOrdenado);

    }

    public void exibirLivrosOrdenadosPorTitulo() {
        List<Map.Entry<String,Livro>> livrosOrdenadosList = new ArrayList<>(livraria.entrySet());

        Collections.sort(livrosOrdenadosList, new ComparatorTitulo());

        Map<String, Livro> livroOrdenado = new LinkedHashMap<>();

        for (Map.Entry<String,Livro> entry : livrosOrdenadosList) {
            livroOrdenado.put(entry.getKey(), entry.getValue());
        }

        System.out.println(livroOrdenado);

    }


    public void pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livroAutor = new HashMap<>();
        boolean foiEncontrado = false;
        for (String key : livraria.keySet()) {
            if(livraria.get(key).getAutor().equals(autor)) {
                livroAutor.put(key, livraria.get(key));
                foiEncontrado = true;
            }
        }

        if(foiEncontrado) {
            System.out.println("Autor Encontrado");
            System.out.println(livroAutor);
        }

        if(!foiEncontrado) {
            System.out.println("Livro não encontrado para esse autor!");
        }
    }

    public void obterLivroMaisCaro() {
        double maior = 0;
        Map<String, Livro> livroCaro = new HashMap<>();

        for (String key : livraria.keySet()) {
            if(livraria.get(key).getPreco() > maior) {
                maior = livraria.get(key).getPreco();
                livroCaro.clear();
                livroCaro.put(key, livraria.get(key));
            }
        }

        System.out.println("O Livro mais caro é " + livroCaro);

    }

    

    public void exibirLivroMaisBarato() {
        Double menor = null;
        Map<String, Livro> livroBarato = new HashMap<>();

        for (String key : livraria.keySet()) {
            if(menor == null) {
                menor = livraria.get(key).getPreco();
                livroBarato.put(key, livraria.get(key));
            }

            if(livraria.get(key).getPreco() < menor) {
                menor = livraria.get(key).getPreco();
                livroBarato.clear();
                livroBarato.put(key, livraria.get(key));
            }
            
        }

        System.out.println("O Livro mais barato é " + livroBarato);

    }

    


    public static void main(String[] args) {
        

        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://www.livrariasaraiva.com.br/livro/9788535232350", "Clean Code", "Robert C. Martin", 59.90);
        livraria.adicionarLivro("https://www.livrariasaraiva.com.br/livro/9788535236001", "Design Patterns: Elements of Reusable Object-Oriented Software", "Gamma, Helm, Johnson, and Vlissides", 89.90);
        livraria.adicionarLivro("https://www.livrariasaraiva.com.br/livro/9788535236102", "Domain-Driven Design: Tackling Complexity in the Heart of Software", "Evans", 69.90);
        livraria.adicionarLivro("https://www.livrariasaraiva.com.br/livro/9788535236206", "Clean Architecture", "Robert C. Martin", 49.90);
        livraria.adicionarLivro("https://www.livrariasaraiva.com.br/livro/9788535236251", "Refactoring: Improving the Design of Existing Code", "Martin Fowler", 69.90);

        System.out.println("Livros Ordenados por Preço \n");
        livraria.exibirLivrosOrdenadosPorPreco();
        System.out.println("\n");

        System.out.println("Livros Ordenados por Titulo \n");
        livraria.exibirLivrosOrdenadosPorTitulo();
        System.out.println("\n");

        livraria.pesquisarLivrosPorAutor("Robert C. Martin");
        System.out.println("\n");

        livraria.obterLivroMaisCaro();
        System.out.println("\n");

        livraria.exibirLivroMaisBarato();


        
    }
}

class ComparatorPreco implements Comparator<Map.Entry<String,Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        
        return Double.compare(o1.getValue().getPreco(), o2.getValue().getPreco());
    }

}


class ComparatorTitulo implements Comparator<Map.Entry<String,Livro>> {

    @Override
    public int compare(Map.Entry<String,Livro> o1, Map.Entry<String,Livro> o2) {
        
        return o1.getValue().getTitulo().compareTo(o2.getValue().getTitulo());

    }

}
