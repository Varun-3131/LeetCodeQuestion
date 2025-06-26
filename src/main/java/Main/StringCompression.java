package Main;

public class StringCompression {
    public int compress(char[] chars) {
        int idx = 0;
        int n = chars.length;

        for (int i = 0; i < n;) {
            char ch = chars[i];
            int count = 0;

            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            chars[idx++] = ch;
            if (count > 1) {
                String str = Integer.toString(count);
                for (char dig : str.toCharArray()) {
                    chars[idx++] = dig;
                }
            }
        }
        return idx;
    }
}
