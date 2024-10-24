package collections.map.OperacoesBasicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class Dicionario {
    
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavras() {

        for (String elementos : dicionarioMap.keySet()) {
            System.out.println(elementos + ": " + dicionarioMap.get(elementos) + " ");
            
        }

        // return dicionarioMap;
    }

    public void pesquisarPorPalavra(String palavra) {
        System.out.println(dicionarioMap.get(palavra));
    }

    @Override
    public String toString() {
        return "" + dicionarioMap + "\n";
    }

    public static void main(String[] args) {
        
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos");
        dicionario.adicionarPalavra("spring", "Framework Java para desenvolvimento web");
        dicionario.adicionarPalavra("bot", "Dispositivo móvel que conversa com o usuário");

        System.out.println("Palavras do dicionário:");
        dicionario.exibirPalavras();

        System.out.println(" ");
        System.out.println("Definição da palavra 'java':");
        dicionario.pesquisarPorPalavra("java");

        System.out.println(" ");
        System.out.println("Removendo a palavra 'spring':");
        dicionario.removerPalavra("spring");
        dicionario.exibirPalavras();


    }

    


}
