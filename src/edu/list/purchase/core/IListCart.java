package edu.list.purchase.core;

public interface IListCart {
    void adicionarItem(String nome, double preco, int quantidade);
    boolean removerItem(String nome);
    double calcularValorTotal();
    void exibirItens();
}
