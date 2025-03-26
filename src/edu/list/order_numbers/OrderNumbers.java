package edu.list.order_numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderNumbers {
    private final List<Integer> numeros;

    public OrderNumbers() {
        this.numeros = new ArrayList<Integer>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero) {
        this.getNumeros().add(numero);
    }

    public void ordenarAscendente() {
        final List<Integer> ordered = new ArrayList<Integer>(this.getNumeros());

        Collections.sort(ordered);

        ordered.forEach(System.out::println);
    }

    public void ordenarDescendente() {
        final List<Integer> ordered = new ArrayList<Integer>(this.getNumeros());

        Collections.sort(ordered);
        Collections.reverse(ordered);

        ordered.forEach(System.out::println);
    }
}
