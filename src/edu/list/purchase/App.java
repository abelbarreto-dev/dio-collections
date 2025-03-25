package edu.list.purchase;

import edu.list.purchase.core.IListCart;
import edu.list.purchase.core.ListCart;

public class App {
    public static void main(String[] args) {
        IListCart listCart = new ListCart();

        listCart.exibirItens();
        listCart.removerItem("123");
        listCart.exibirItens();
        System.out.println(listCart.calcularValorTotal());

        listCart.adicionarItem("bombom", 10.0, 8);
        listCart.exibirItens();
        System.out.println(listCart.calcularValorTotal());

        listCart.adicionarItem("arroz", 7.5, 10);
        listCart.exibirItens();
        System.out.println(listCart.calcularValorTotal());

        listCart.removerItem("bombom");
        listCart.exibirItens();
        System.out.println(listCart.calcularValorTotal());
    }
}
