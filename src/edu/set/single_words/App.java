package edu.set.single_words;

public class App {
    public static void main(String[] args) {
        var setSingleWords = new SetSingleWords();

        setSingleWords.showSingleWords();

        setSingleWords.addWord("banana");
        setSingleWords.addWord("joy");
        setSingleWords.addWord("banana");
        setSingleWords.addWord("tomato");
        setSingleWords.addWord("strawberry");
        setSingleWords.addWord("bean");
        setSingleWords.addWord("strawberry");

        setSingleWords.showSingleWords();

        System.out.println("tem banana? "+setSingleWords.checkHasWord("banana"));

        setSingleWords.removeWord("banana");

        System.out.println("tem banana? "+setSingleWords.checkHasWord("banana"));

        setSingleWords.showSingleWords();
    }
}
