package edu.list.purchase.core;

import edu.list.purchase.model.Cart;

import java.util.ArrayList;
import java.util.List;

public class ListCart implements IListCart {
    private final List<Cart> listCart;

    public ListCart() {
        this.listCart = new ArrayList<>();
    }

    public List<Cart> getListCart() {
        return listCart;
    }

    @Override
    public void adicionarItem(String nome, double preco, int quantidade) {
        var cart = new Cart();

        cart.setNome(nome);
        cart.setPreco(preco);
        cart.setQuantidade(quantidade);

        this.getListCart().add(cart);
    }

    @Override
    public boolean removerItem(final String nome) {
        List<Cart> items = new ArrayList<>();

        this.getListCart().forEach(cart -> {
            if (cart.getNome().equalsIgnoreCase(nome))
                items.add(cart);
        });

        return this.getListCart().removeAll(items);
    }

    @Override
    public double calcularValorTotal() {
        double totalValue = 0.0;

        for (Cart cart : this.getListCart()) {
            totalValue += cart.getPreco() * cart.getQuantidade();
        }

        return totalValue;
    }

    @Override
    public void exibirItens() {
        this.getListCart().forEach(System.out::println);
    }
}
