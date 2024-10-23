package collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    
    private Set<Tarefa> lista_tarefa;

    public ListaTarefa() {
        this.lista_tarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        lista_tarefa.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        boolean tarefaRemovida = false;
        for (Tarefa tarefa : lista_tarefa) {
            if(tarefa.getDescricao().equals(descricao)) {
                tarefaRemovida = true;
                lista_tarefa.remove(tarefa);
                System.out.println("Tarefa removida com sucesso!");
                break;
            }
        }

        if(tarefaRemovida == false) {
            System.out.println("Não foi possivel remover, Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if(!lista_tarefa.isEmpty())
            for (Tarefa tarefa : lista_tarefa) {
                System.out.println(tarefa);
            }
        else
            System.out.println("Lista está vazia");
    }

    public void contarTarefas() {
        System.out.println("Quantidade de tarefas: " + lista_tarefa.size());
    }
    
    public void obterTarefasConcluidas() {
        System.out.println("Tarefas concluidas:");
        boolean possuiTarefas = false;
        if(!lista_tarefa.isEmpty())
            for (Tarefa tarefa : lista_tarefa) {
                if(tarefa.isFoiConcluida()) {
                    System.out.println(tarefa);
                    possuiTarefas = true;
                }
            }

            if(!possuiTarefas) {
                System.out.println("Não existem tarefas concluidas!\n");
            }
        
        if(lista_tarefa.isEmpty()) {
            System.out.println("Não existem tarefas concluidas!");
        } 

    }
    
    public void obterTarefasPendentes() {
        System.out.println("Tarefas pendentes:");
        if(!lista_tarefa.isEmpty())
            for (Tarefa tarefa : lista_tarefa) {
                if(!tarefa.isFoiConcluida()) {
                    System.out.println(tarefa);
                }
            }
    }

    public void marcarTarefaConcluida(String descricao) {
        boolean tarefaEncontrada = false;
        if(!lista_tarefa.isEmpty()) 
            for (Tarefa tarefa : lista_tarefa) {
                if(tarefa.getDescricao().equals(descricao)) {
                    tarefa.setFoiConcluida(true);
                    tarefaEncontrada = true;
                    System.out.println("Tarefa marcada como concluída!");
                    break;
                }
            }

            if(!tarefaEncontrada) {
                System.out.println("Tarefa não encontrada!");
            }
        if(lista_tarefa.isEmpty()) {
            System.out.println("Não existem tarefas para marcar como concluída!");
        }

    }

    public void marcarTarefaPendente(String descricao) {
        boolean tarefaEncontrada = false;
        if(!lista_tarefa.isEmpty())
            for (Tarefa tarefa : lista_tarefa) {
                if(tarefa.getDescricao().equals(descricao)) {
                    tarefa.setFoiConcluida(false);
                    tarefaEncontrada = true;
                    System.out.println("Tarefa marcada como pendente!");
                    break;
                }
            }

            if(!tarefaEncontrada) {
                System.out.println("Tarefa não encontrada!");
            }


        if(lista_tarefa.isEmpty()){
            System.out.println("Não existem tarefas na lista");
        }
               
    }

    public void limparListaTarefas() {
        lista_tarefa.clear();
        System.out.println("Todas as tarefas foram removidas!");
    }



    public static void main(String[] args) {
        
        ListaTarefa lista = new ListaTarefa();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Ler livro");
        lista.adicionarTarefa("Tomar café");
        lista.adicionarTarefa("Tomar café");
        lista.contarTarefas();

        lista.removerTarefa("Tomar café");

        lista.exibirTarefas();
        System.out.println(" ");
        lista.contarTarefas();

        lista.obterTarefasConcluidas();
        lista.obterTarefasPendentes();
        System.out.println(" ");

        lista.marcarTarefaConcluida("Estudar Java");
        lista.obterTarefasConcluidas();
        System.out.println(" ");

        lista.marcarTarefaPendente("Estudar Java");
        lista.obterTarefasPendentes();
        System.out.println(" ");

        lista.limparListaTarefas();
        lista.exibirTarefas();
        lista.contarTarefas();
        

        System.out.println("Fim do programa!");
    }
}
