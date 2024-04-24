package Main;

public class SingleNumber_II {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int x : nums) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
