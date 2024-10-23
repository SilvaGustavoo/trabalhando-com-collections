package collections.set.Ordenacao;

import java.util.Comparator;

public class Comparators {
    
}

class OrdenacaoAlunoPorNome implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return a1.getNome().compareTo(a2.getNome());
    }

} 

class OrdenacaoAlunoPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }

} 