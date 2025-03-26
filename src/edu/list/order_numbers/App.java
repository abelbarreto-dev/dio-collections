package edu.list.order_numbers;

public class App {
    public static void main(String[] args) {
        var order = new OrderNumbers();

        order.adicionarNumero(5);
        order.adicionarNumero(3);
        order.adicionarNumero(6);
        order.adicionarNumero(1);
        order.adicionarNumero(8);
        order.adicionarNumero(2);
        order.adicionarNumero(0);
        order.adicionarNumero(9);
        order.adicionarNumero(4);
        order.adicionarNumero(7);

        System.out.println("originals");
        order.getNumeros().forEach(System.out::println);

        System.out.println("ascendente");
        order.ordenarAscendente();

        System.out.println("descendente");
        order.ordenarDescendente();

        System.out.println("originals");
        order.getNumeros().forEach(System.out::println);

    }
}
