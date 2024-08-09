package Main;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        String shortest, longest;

        if (str1.length() < str2.length()) {
            shortest = str1;
            longest = str2;
        } else {
            shortest = str2;
            longest = str1;
        }

        StringBuilder solution = new StringBuilder();
        int shortestLength = shortest.length();
        int longestLength = longest.length();

        for (int i = shortestLength; i > 0; --i) {
            if (longestLength % i != 0 || shortestLength % i != 0) continue;

            for (int j = 0; j < longestLength; ++j) {
                int firstPointer = j % i;
                int secondPointer = j % shortestLength;

                if (shortest.charAt(firstPointer) != longest.charAt(j) || shortest.charAt(secondPointer) != longest.charAt(j)) {
                    solution.setLength(0); // Clear the solution
                    break;
                }

                if (firstPointer == j) solution.append(longest.charAt(j));
            }

            if (solution.length() != 0) return solution.toString();
        }

        return "";
    }
}
