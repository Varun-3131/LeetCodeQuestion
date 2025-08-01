package Main;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        // Split by spaces and filter out empty strings
        String[] words = s.trim().split("\\s+");

        // Reverse the array
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
