package Main;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String s = paragraph.toLowerCase();
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            StringBuffer e = new StringBuffer();
            while(i < s.length() && s.charAt(i) > 96 && s.charAt(i) < 123)
                e.append(""+s.charAt(i++));
            if(e.length() != 0)
                map.put(e.toString(),map.getOrDefault(e.toString(),0)+1);
        }

        for(String w : banned) map.remove(w);
        return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
    }
}
