package edu.list.soma_numeros;

public class App {
    public static void main(String[] args) {
        var somaNumeros = new SomaNumeros();

        somaNumeros.exibirNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(21);
        somaNumeros.adicionarNumero(-8);
        somaNumeros.adicionarNumero(14);
        somaNumeros.adicionarNumero(42);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-25);
        somaNumeros.adicionarNumero(31);

        System.out.println("Maior: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor: " + somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();
    }
}
