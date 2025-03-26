package edu.set.single_words;

import java.util.HashSet;
import java.util.Set;

public class SetSingleWords {
    private final Set<String> words;

    public SetSingleWords() {
        this.words = new HashSet<String>();
    }

    public Set<String> getWords() {
        return words;
    }

    public void addWord(String word) {
        this.getWords().add(word);

        System.out.println("Word added");
    }

    public void removeWord(String word) {
        this.getWords().remove(word);

        System.out.println("Word removed");
    }

    public boolean checkHasWord(String word) {
        return this.getWords().contains(word);
    }

    public void showSingleWords() {
        this.getWords().forEach(System.out::println);
    }
}
