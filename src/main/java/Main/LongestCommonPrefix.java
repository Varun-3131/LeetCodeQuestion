package Main;
import java.util.Arrays;
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
        Arrays.sort(strs);
        //First string...
        char[] first=strs[0].toCharArray();
        //Last String...
        char[] last=strs[strs.length-1].toCharArray();
        //Check First and last...
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
    }

