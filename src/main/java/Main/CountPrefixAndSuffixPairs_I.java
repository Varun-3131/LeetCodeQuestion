package Main;

public class CountPrefixAndSuffixPairs_I {
    public int countPrefixSuffixPairs(String[] words) {

        int count=0;
        for( int i=0;i<words.length;i++ ) {

            String st1= words[i];
            for( int j=i+1;j<words.length;j++ ) {

                String st2= words[j];
                boolean ch =true;
                for( int k=0;k<Math.min(st1.length(),st2.length());k++ ) {

                    if( st1.length() > st2.length()) { ch=false;break;}
                    if( (st1.charAt(k) != st2.charAt(k)) || (st1.charAt(st1.length()-1-k) != st2.charAt(st2.length()-1-k))) { ch=false;break;}
                }

                if( ch)  count++;

            }
        }

        return count;
    }
}
