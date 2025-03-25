package edu.list.tasks.core;

import java.util.List;

public interface IListTasks {
    void adicionarTarefas(String descricao);
    void removerTarefa(String descricao);
    List<String> obsterDescricaoTarefas();
    int contarTarefas();
}
