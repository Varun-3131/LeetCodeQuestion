package Main;

public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;


        int[] secretCounter = new int[10];
        int[] guessCounter = new int[10];


        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else {
                secretCounter[s - '0']++;
                guessCounter[g - '0']++;
            }
        }


        for (int i = 0; i < 10; i++) {
            cows += Math.min(secretCounter[i], guessCounter[i]);
        }

        return bulls + "A" + cows + "B";
    }
}
