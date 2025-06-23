package Main;

public class ValidPalindrome {
    boolean isAlpha(char ch) {
        if ((ch >= '0' && ch <= '9') || (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        int st = 0;
        int end = s.length() - 1;
        while (st <= end) {
            if (!isAlpha(s.charAt(st))) { // NOT isAlpha
                st++;
                continue;
            }
            if (!isAlpha(s.charAt(end))) { // NOT isAlpha
                end--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

}
