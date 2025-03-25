package edu.list.tasks.core;

import edu.list.tasks.model.Task;

import java.util.ArrayList;
import java.util.List;

public class ListTasks implements IListTasks {
    private List<Task> tasks;

    public ListTasks() {
        this.tasks = new ArrayList<Task>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public void adicionarTarefas(String descricao) {
        var task = new Task();
        task.setDescricao(descricao);
        this.getTasks().add(task);
    }

    @Override
    public void removerTarefa(String descricao) {
        List<Task> foundTask = new ArrayList<>();

        for (Task task : this.getTasks()) {
            if (task.getDescricao().equalsIgnoreCase(descricao)) {
                foundTask.add(task);
            }
        }

        if (foundTask.isEmpty())
            System.out.println("Tarefa não encontrada");
        else {
            this.getTasks().removeAll(foundTask);
            System.out.println("Tarefa removida!");
        }
    }

    @Override
    public List<String> obsterDescricaoTarefas() {
        List<String> descricoes = new ArrayList<>();

        this.getTasks().forEach((Task task) -> {
            descricoes.add(task.getDescricao());
        });

        return descricoes;
    }

    @Override
    public int contarTarefas() {
        return this.getTasks().size();
    }
}
