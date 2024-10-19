package collections.list.ordenacao.funcionario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;



public class ListaFuncionarios {

    private List<Funcionario> list_funcionario;

    public ListaFuncionarios() {
        this.list_funcionario = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.list_funcionario.add(funcionario);
    }

    public List<Funcionario> getFuncionariosOrdenadosPorNome() {
        List<Funcionario> listaOrdenada = new ArrayList<>(list_funcionario);
        // listaOrdenada.sort(Comparator.comparing(Funcionario::getNome));
        Collections.sort(listaOrdenada, new ComparatorNome());
        return listaOrdenada;
    }

    public List<Funcionario> getFuncionariosOrdenadosPorIdade() {
        List<Funcionario> listaOrdenada = new ArrayList<>(list_funcionario);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    


    @Override
    public String toString() {
        return "list_funcionario: \n" + list_funcionario + "";
    }

    public static void main(String[] args) {
        
        ListaFuncionarios listaFuncionarios = new ListaFuncionarios();

        listaFuncionarios.adicionarFuncionario(new Funcionario("João", "Gerente", 40));
        listaFuncionarios.adicionarFuncionario(new Funcionario("Otavio", "Gerente", 40));
        listaFuncionarios.adicionarFuncionario(new Funcionario("Maria", "Designer", 35));
        listaFuncionarios.adicionarFuncionario(new Funcionario("Pedro", "Analista", 38));
        listaFuncionarios.adicionarFuncionario(new Funcionario("Naiara", "Analista", 25));

        List<Funcionario> listaOrdenadosPorNome = listaFuncionarios.getFuncionariosOrdenadosPorNome();
        List<Funcionario> listaOrdenadosPorIdade = listaFuncionarios.getFuncionariosOrdenadosPorIdade();

        System.out.println("Funcionários ordenados por nome:" + listaFuncionarios.getFuncionariosOrdenadosPorNome());
        System.out.println("Funcionários ordenados por idade:" + listaFuncionarios.getFuncionariosOrdenadosPorIdade());

        
    }
    
}
