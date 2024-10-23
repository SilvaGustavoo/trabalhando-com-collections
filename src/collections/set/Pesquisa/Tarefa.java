package collections.set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    
    private String descricao;
    private boolean foiConcluida;

    public Tarefa(String descricao, boolean foiConcluida) {
        this.descricao = descricao;
        this.foiConcluida = foiConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFoiConcluida() {
        return foiConcluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFoiConcluida(boolean foiConcluida) {
        this.foiConcluida = foiConcluida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa [descricao: " + descricao + 
            ", foiConcluida: " + foiConcluida + "]";
    }
    
    

    
}
