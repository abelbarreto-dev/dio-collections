package edu.map.count_word;

import java.util.HashMap;
import java.util.Map;

public class CountWord {
    private final Map<String, Integer> words;

    public CountWord() {
        this.words = new HashMap<>();
    }

    private Map<String, Integer> getWords() {
        return words;
    }

    void addNewWord(String word, Integer count) {
        if (this.getWords().put(word, count) != null)
            throw new RuntimeException("warning: word already exists.");

        System.out.println("success: word added.");
    }

    void removeWord(String word) {
        this.checkWordsEmpty();

        if (this.getWords().remove(word) == null)
            throw new RuntimeException("warning: word not exists");

        System.out.println("success: word deleted.");
    }

    void showWords() {
        this.checkWordsEmpty();

        this.getWords().forEach(
            (String word, Integer count) -> {
                System.out.println("{ word=" + word + ", count=" + count + " }");
            }
        );
    }

    void wordMoreFrequent() {
        this.checkWordsEmpty();

        int greaterCount = Integer.MIN_VALUE;

        String foundWord = "";

        for (String word : this.getWords().keySet()) {
            if (this.getWords().get(word) > greaterCount) {
                greaterCount = this.getWords().get(word);
                foundWord = word;
            }
        }

        System.out.println("{ word=" + foundWord + ", count=" + greaterCount + " }");
    }

    private void checkWordsEmpty() {
        if (this.getWords().isEmpty())
            throw new RuntimeException("error: words map is empty.");
    }
}
