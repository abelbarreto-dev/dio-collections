package edu.map.dictionary;

public class App {
    public static void main(String[] args) {
        var dict = new Dictionary();

        dict.exibirPalavras();

        dict.adicionarPalavra("leao", "felino masculino");
        dict.adicionarPalavra("banana", "fruta amarela");
        dict.adicionarPalavra("carro", "veículo");
        dict.adicionarPalavra("mulher", "humano feminino");

        dict.exibirPalavras();

        System.out.println("leão: " + dict.pesquisarPorPalavra("leao"));

        dict.removerPalavra("leao");

        dict.exibirPalavras();

        System.out.println("leão: " + dict.pesquisarPorPalavra("leao"));
        System.out.println("carro: " + dict.pesquisarPorPalavra("carro"));
    }
}
