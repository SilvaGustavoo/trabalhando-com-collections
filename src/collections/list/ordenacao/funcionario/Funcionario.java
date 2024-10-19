package collections.list.ordenacao.funcionario;

import java.util.Comparator;

public class Funcionario implements Comparable<Funcionario> {
    
    private String nome;
    private String cargo;
    private int idade;

    public Funcionario(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Funcionario o) {
        return Integer.compare(idade, o.getIdade());
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", cargo=" + cargo + ", idade=" + idade + "\n";
    }

    
}

class ComparatorNome implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return o1.getNome().compareTo(o2.getNome());
    }

}