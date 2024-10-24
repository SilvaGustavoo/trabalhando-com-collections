package collections.map.Pesquisa;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ContagemPalavras {
    
    private Map<String, Integer> contadorPalavras;

    public ContagemPalavras() {
        this.contadorPalavras = new HashMap<>();
    }

    public void realizarContagem(String texto) {
        List<String> lista_palavras = new ArrayList<String>();
        lista_palavras.addAll(Arrays.asList(texto.toLowerCase().split(" ")));

        for (String palavra : lista_palavras) {
            if (contadorPalavras.containsKey(palavra)) {
                contadorPalavras.put(palavra, contadorPalavras.get(palavra) + 1);
            }
        }
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contadorPalavras.put(palavra, 0);
    }

    public void removerPalavra(String palavra) {
        contadorPalavras.remove(palavra);
    }

    public void exibirContagemPalavras() {
        for (String key : contadorPalavras.keySet()) {
            System.out.println(key + ": " + contadorPalavras.get(key));
        }
    }

    public void encontrarPalavraMaisFrequente() {
        String palavraFrequente = null;
        int maximo = 0;

        for (String palavra : contadorPalavras.keySet()) {
            if(palavraFrequente == null) {
                palavraFrequente = palavra;
                maximo = contadorPalavras.get(palavra);
            } else if (contadorPalavras.get(palavra) > maximo) {
                maximo = contadorPalavras.get(palavra);
            }

        }

        System.out.println("Palavra mais frequente: " + palavraFrequente + ", com " + maximo + " ocorrências");
    }
    
    public static void main(String[] args) {
        
        ContagemPalavras contador = new ContagemPalavras();

        contador.adicionarPalavra("java", 0);
        contador.adicionarPalavra("linguagem", 0);
        contador.adicionarPalavra("programação", 0);

        contador.realizarContagem("Java é uma linguagem de programação orientada a objetos e multiplataforma, criada em 1995 pela Sun Microsystems. O Java é usado para desenvolver aplicativos, sistemas operacionais, software empresarial, aplicações de big data e tecnologias do servidor.");

        contador.exibirContagemPalavras();

        contador.encontrarPalavraMaisFrequente();

        contador.removerPalavra("programação");

        contador.exibirContagemPalavras();

    }
}
