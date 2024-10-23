package collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    private Set<Aluno> lista_aluno;

    public GerenciadorAlunos() {
        this.lista_aluno = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        lista_aluno.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        boolean alunoRemovido = false;
        for (Aluno aluno : lista_aluno) {
            if(aluno.getMatricula() == matricula) {
                lista_aluno.remove(aluno);
                alunoRemovido = true;
                System.out.println("Aluno removido com sucesso!");
                break;
            }
        }

        if(!alunoRemovido) {
            System.out.println("Erro ao remover: aluno não encontrado ");
        }
    }

    public Set<Aluno> exibirAlunos() {
        Set<Aluno> exibiAlunos = new TreeSet<>(lista_aluno);
        return exibiAlunos;
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosOrdenadosPorNome = new TreeSet<>(new OrdenacaoAlunoPorNome());
        alunosOrdenadosPorNome.addAll(lista_aluno);
        return alunosOrdenadosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosOrdenadosPorNota = new TreeSet<>(new OrdenacaoAlunoPorNota());
        alunosOrdenadosPorNota.addAll(lista_aluno);
        return alunosOrdenadosPorNota;
    }

    

    @Override
    public String toString() {
        return " " + lista_aluno + " ";
    }

    public static void main(String[] args) {
        
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("Alice", 123456, 7.5);
        gerenciador.adicionarAluno("Bob", 234567, 8.5);
        gerenciador.adicionarAluno("Charlie", 345678, 9);

        System.out.println("Alunos:");
        System.out.println(gerenciador.exibirAlunos());

        System.out.println(" ");
        System.out.println("Alunos por Nota");
        System.out.println(gerenciador.exibirAlunosPorNota());

        System.out.println(" ");

        gerenciador.removerAluno(234567);

        System.out.println(" ");
        System.out.println("Alunos por Nome");
        System.out.println(gerenciador.exibirAlunosPorNota());
        
    }

}
