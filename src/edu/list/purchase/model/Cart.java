package edu.list.purchase.model;

public class Cart {
    private String nome;
    private double preco;
    private int quantidade;

    public String toString() {
        return "Cart -> {nome=".
                concat(this.getNome()).
                concat(", preço=R$ ").
                concat(Double.toString(this.getPreco())).
                concat(", quantidade=").
                concat(Integer.toString(this.getQuantidade())).
                concat("}");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
