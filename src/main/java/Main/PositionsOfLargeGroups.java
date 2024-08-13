package Main;

public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = s.length();
        char prev = s.charAt(0);
        int st = 0;
        int end = 0;
        for(int i=1; i<n; i++){
            char ch = s.charAt(i);
            if(ch==prev){
                end=i;
            }else{
                int size = end-st+1;
                if(size>=3){
                    List<Integer> a = new ArrayList<>(List.of(st,end));
                    ans.add(a);
                }
                prev = ch;
                st = i;
                end = i;
            }
        }
        int size = end-st+1;
        if(size>=3){
            List<Integer> a = new ArrayList<>(List.of(st,end));
            ans.add(a);
        }
        return ans;
    }
}
