public class SentenceSplit {
    public static void main(String[] args) {

        String sentence = "Java is very easy";

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Rebuild sentence in new format
        String newSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            newSentence = newSentence + words[i] + " ";
        }

        System.out.println("Original sentence: " + sentence);
        System.out.println("New sentence: " + newSentence);
    }
}
