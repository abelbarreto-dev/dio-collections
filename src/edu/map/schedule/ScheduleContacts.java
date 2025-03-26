package edu.map.schedule;

import java.util.HashMap;
import java.util.Map;

public class ScheduleContacts {
    private final Map<String, Integer> contacts;

    public ScheduleContacts() {
        this.contacts = new HashMap<String, Integer>();
    }

    public Map<String, Integer> getContacts() {
        return contacts;
    }

    void adicionarContato(String nome, Integer telefone) {
        this.getContacts().put(nome, telefone);

        System.out.println("contato adicionado.");
    }

    void removerContato(String nome) {
        if (!this.getContacts().containsKey(nome)) {
            System.out.println("não é possível remover - contato não encontrado");
            return;
        }

        this.getContacts().remove(nome);

        System.out.println("contato removido.");
    }

    void exibirContatos() {
        if (this.getContacts().isEmpty()) {
            System.out.println("essa agenda está vazia.");
            return;
        }

        this.getContacts().forEach((String key, Integer value) -> {
            System.out.printf("{nome=%s, value=%d}%n", key, value);
        });
    }

    Integer pesquisarContato(String nome) {
        Integer telefone = this.getContacts().get(nome);

        return telefone;
    }
}
