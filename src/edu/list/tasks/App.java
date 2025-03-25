package edu.list.tasks;

import edu.list.tasks.core.IListTasks;
import edu.list.tasks.core.ListTasks;

public class App {
    public static void main(String[] args) {
        IListTasks lists = new ListTasks();

        lists.adicionarTarefas("hoje caminhar na serra");
        lists.adicionarTarefas("ir para a faculdade");
        lists.obsterDescricaoTarefas();
        System.out.println("Quantidade de Tarefas: " + lists.contarTarefas());
        System.out.println("=================");
        lists.removerTarefa("ir para a faculdade");
        lists.obsterDescricaoTarefas();
        System.out.println("Quantidade de Tarefas: " + lists.contarTarefas());
    }
}
