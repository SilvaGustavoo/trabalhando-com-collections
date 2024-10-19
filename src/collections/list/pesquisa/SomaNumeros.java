package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numbers; 

    public SomaNumeros() {
        this.numbers = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numbers.add(numero);
    }

    public int calcularSoma() {
        int total = 0;
        if(!numbers.isEmpty()) {
            for (int num : numbers) {
                total += num;
            }
        } else {
            System.out.println("A lista de números é vazia");
        }

        return total;
    }

    public int encontrarMaiorNumero() {
        int maior = 0;
        boolean coletarNum = true;
        if(!numbers.isEmpty()) {
            for (int num : numbers) {
                if(coletarNum) {
                    maior = num;
                    coletarNum = false; // Coletar o primeiro noumero do array
                }

                if(num > maior) {
                    maior = num;
                }
            }
        } else {
            System.out.println("A lista de números é vazia");
        }

        return maior;
    }

    public int encontrarMenorNumero() {
        Integer menor = 0;
        boolean coletarNum = true;
        if(!numbers.isEmpty()) {
            for (int num : numbers) {
                if(coletarNum) {
                    menor = num;
                    coletarNum = false; // Coletar o primeiro noumero do array
                }

                if(num < menor) {
                    menor = num;
                }
            }
        } else {
            System.out.println("A lista de números é vazia");
        }
        
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Lista de Numeros " + numbers + "";
    }


    public static void main(String[] args) {
        
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(60);
        soma.adicionarNumero(20);
        soma.adicionarNumero(30);
        soma.adicionarNumero(40);
        soma.adicionarNumero(70);

        

        System.out.println(" " );
        System.out.println("Soma: " + soma.calcularSoma());
        System.out.println("Maior número: " + soma.encontrarMaiorNumero());
        System.out.println("Menor número: " + soma.encontrarMenorNumero());
        soma.exibirNumeros();
        

    }

    
    
}
