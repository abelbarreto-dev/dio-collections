package edu.list.soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<Integer>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero) {
        this.getNumeros().add(numero);
    }

    public int calcularSoma() {
        int somaTotal = 0;

        for (Integer numero : this.getNumeros()) {
            somaTotal += numero;
        }

        return somaTotal;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = this.getNumeros().isEmpty() ? 0 : this.getNumeros().getFirst();

        for (Integer numero : this.getNumeros()) {
            if (numero > maiorNumero)
                maiorNumero = numero;
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = this.getNumeros().isEmpty() ? 0 : this.getNumeros().getFirst();

        for (Integer numero : this.getNumeros()) {
            if (numero < menorNumero)
                menorNumero = numero;
        }

        return menorNumero;
    }

    public void exibirNumeros() {
        this.getNumeros().forEach(System.out::println);
    }
}
