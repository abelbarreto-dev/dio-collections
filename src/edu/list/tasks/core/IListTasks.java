package edu.list.tasks.core;

public interface IListTasks {
    void adicionarTarefas(String descricao);
    void removerTarefa(String descricao);
    void obsterDescricaoTarefas();
    int contarTarefas();
}
