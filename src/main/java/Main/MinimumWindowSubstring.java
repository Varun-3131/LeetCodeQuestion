package Main;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int charCount = freq.size();
        int start = -1;
        int winStart = 0;
        int winEnd = 0;
        int minLen = Integer.MAX_VALUE;
        int n = s.length();

        while (winEnd < n) {
            char ch = s.charAt(winEnd);
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) - 1);
                if (freq.get(ch) == 0) {
                    charCount--;
                }
            }

            while (charCount == 0) {
                int len = winEnd - winStart + 1;
                if (len < minLen) {
                    minLen = len;
                    start = winStart;
                }

                char leftChar = s.charAt(winStart);
                if (freq.containsKey(leftChar)) {
                    freq.put(leftChar, freq.get(leftChar) + 1);
                    if (freq.get(leftChar) > 0) {
                        charCount++;
                    }
                }
                winStart++;
            }
            winEnd++;
        }

        if (start == -1) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}
