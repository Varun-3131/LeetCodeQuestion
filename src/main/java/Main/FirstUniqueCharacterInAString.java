package Main;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {

        if(s.length() == 1) {
            return 0;
        }

        int[] counter = new int[26];

        for(char c : s.toCharArray()) {
            counter[c - 'a']++;
        }

        for(char c : s.toCharArray()) {
            if(counter[c - 'a'] == 1) {
                return s.indexOf(c);
            }
        }

        return -1;
    }
}
