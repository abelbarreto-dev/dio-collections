package edu.list.tasks.core;

import edu.list.tasks.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

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
        AtomicReference<Task> foundTask = new AtomicReference<>();
        this.getTasks().forEach((Task task) -> {
            if (task.getDescricao().equals(descricao)) {
                foundTask.set(task);
            }
        });

        if (foundTask.get() == null)
            System.out.println("Tarefa não encontrada");
        else {
            this.getTasks().remove(foundTask.get());
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
