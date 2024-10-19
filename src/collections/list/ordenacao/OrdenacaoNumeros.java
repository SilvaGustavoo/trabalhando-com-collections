package collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros  {
    
    private List<Integer> list_numbers;
    private Integer number;

    public OrdenacaoNumeros() {
        this.list_numbers = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.list_numbers.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaOrdemAscendente = new ArrayList<>(list_numbers);
        Collections.sort(listaOrdemAscendente);
        return listaOrdemAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaOrdemDescendente = new ArrayList<>(list_numbers);
        listaOrdemDescendente.sort(Collections.reverseOrder());
        return listaOrdemDescendente;
    }



    public static void main(String[] args) {
        
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(2);

        System.out.println("Numeros ordenados em ordem crescente: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Numeros ordenados em ordem decrescente: " + ordenacaoNumeros.ordenarDescendente());

        // Adicionando um novo número
        ordenacaoNumeros.adicionarNumero(1);
    }

}

