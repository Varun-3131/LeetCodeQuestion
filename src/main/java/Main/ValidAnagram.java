package Main;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int sLen=s.length();
        int tLen=t.length();

        if(sLen!=tLen) return false;

        int[] arr=new int[26];

        for(int i=0;i<sLen;i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<tLen;i++){
            arr[t.charAt(i)-'a']--;
            if(arr[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;

    }
}
