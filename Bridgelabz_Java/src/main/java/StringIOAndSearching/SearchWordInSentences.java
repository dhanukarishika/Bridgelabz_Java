package StringIOAndSearching;
/*
 * Q11. Linear Search - Search for a Specific Word in Sentences
 * Find the first sentence containing a given word.
 * Return "Not Found" if the word does not exist.
 */
public class SearchWordInSentences {
    // Search for a word using Linear Search
    static String searchWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            // Check if the sentence contains the given word
            String[] words = sentence.split("\\W+");
            for (String w : words) {
                if (w.equalsIgnoreCase(word)) {
                    return sentence;
                }
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {
                "Java is a programming language",
                "Python is easy to learn",
                "Data Structures are important",
                "I enjoy coding in Java"
        };
        String word = "Structures";
        System.out.println("Word to Search: " + word);
        System.out.println("Result: " + searchWord(sentences, word));
    }
}
