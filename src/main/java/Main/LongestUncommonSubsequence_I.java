package Main;

public class LongestUncommonSubsequence_I {
    public int findLUSlength(String a, String b)
    {
        int la=a.length();
        int lb=b.length();
        if(a.equals(b)){
            return -1;
        }
        else{
            if (la>lb){
                return la;
            }
            else{
                return lb;
            }

        }

    }
}
