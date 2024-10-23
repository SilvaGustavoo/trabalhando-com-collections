package collections.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> lista_palavras;

    public ConjuntoPalavrasUnicas() {
        this.lista_palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        lista_palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraRemover = null;
        for (String p : lista_palavras) {
            if(p.equals(palavra)) {
                palavraRemover = p;
                System.out.println("Palavra removida");
                break;
            }
        }

        if(palavraRemover!=null) {
            lista_palavras.remove(palavraRemover);
        } else {
            System.out.println("Palavra não encontrada");
        }
    }

    public void verificarPalavra(String palavra) {
        boolean estaPresente = false;
        for (String string : lista_palavras) {
            if(string == palavra) {
                System.out.println("Palavra encontrada !!");
                estaPresente = true;
                break;
            }
        }

        if(!estaPresente) {
            System.out.println("Palavra não encontrada!!");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(lista_palavras);
    }

    

    public static void main(String[] args) {
        
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("teste");
        conjunto.adicionarPalavra("teste");

        conjunto.adicionarPalavra("teste 2");
        conjunto.adicionarPalavra("teste 3");


        conjunto.removerPalavra("teste 3");
        conjunto.removerPalavra("teste 3");
        conjunto.verificarPalavra("teste 2");
        System.out.println("\nPalavras únicas:");
        conjunto.exibirPalavrasUnicas();



    }

}
