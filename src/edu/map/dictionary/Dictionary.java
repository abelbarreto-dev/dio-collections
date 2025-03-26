package edu.map.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private final Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    void adicionarPalavra(String palavra, String definicao) {
        this.getDictionary().put(palavra, definicao);

        System.out.println("palavra adicionada.");
    }

    void removerPalavra(String palavra) {
        if (!this.getDictionary().containsKey(palavra)) {
            System.out.println("não removido - palavra não encontrada.");
            return;
        }

        this.getDictionary().remove(palavra);

        System.out.println("palavra removida.");
    }

    void exibirPalavras() {}

    String pesquisarPorPalavra(String palavra) {
        String definicao = this.getDictionary().get(palavra);

        if (definicao == null)
            System.out.println("palavra não encontrada.");

        return definicao;
    }
}
