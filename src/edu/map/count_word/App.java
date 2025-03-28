package edu.map.count_word;

public class App {
    public static void main(String[] args) {
        try {
            var countWords = new CountWord();

            countWords.addNewWord("banana", 5);
            countWords.addNewWord("maçã", 4);
            countWords.addNewWord("pera", 3);
            countWords.addNewWord("abacate", 10);

            countWords.showWords();

            countWords.removeWord("banana");

            countWords.showWords();

            System.out.println("more frequent".toUpperCase());

            countWords.wordMoreFrequent();

            countWords.removeWord("tomato");
        }
        catch (RuntimeException re) {
            System.err.println(re.getMessage());
        }
    }
}
