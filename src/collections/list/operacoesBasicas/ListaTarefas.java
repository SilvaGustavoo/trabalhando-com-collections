package collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    private List<Tarefa> tarefas;
    
    public ListaTarefas() {
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefaAdicionar = new Tarefa(descricao);

        try {
            tarefas.add(tarefaAdicionar);
            System.out.println("Tarefa adicionada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar tarefa: " + e);
        }
        
        
    }

    public void removerTarefa(String descricao) {
        boolean tarefaEncontrada = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {

                try {
                    tarefas.remove(tarefa);
                    System.out.println("Tarefa removida com sucesso!");
                    tarefaEncontrada = true;
                    break;
                } catch (Exception e) {
                    System.out.println("Erro ao remover tarefa: " + e);
                }
                
            } 
        }

        if(tarefaEncontrada == false) {
            System.out.println("Tarefa não encontrada.");
        }
        
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public List<String> obterDescricoesTarefas() {
        List<String> descricoes = new ArrayList<String>();

        for (Tarefa tarefa : tarefas) {
            descricoes.add(tarefa.getDescricao());
        }

        return descricoes;
    }

    
}
