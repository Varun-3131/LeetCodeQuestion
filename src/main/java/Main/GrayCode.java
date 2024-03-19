package Main;

public class GrayCode {
    List<Integer> answer;
    HashSet<String> visited;
    public List<Integer> grayCode(int n) {
        visited = new HashSet();
        answer = new ArrayList();
        StringBuilder s = new StringBuilder();
        for(int i=0;i<n;i++)
            s.append('0');
        dfs(s,n);
        return answer;
    }
    void dfs(StringBuilder s,  int n)
    {
        if(visited.contains(s.toString()))
            return;
        visited.add(s.toString());
        answer.add(Integer.parseInt(s.toString(),2));
        for(int i=0;i<n;i++)
        {
            char o = s.charAt(i);
            char c = (o=='0')?'1': '0';
            s.setCharAt(i,c);
            if(!visited.contains(c))
                dfs(s,n);
            s.setCharAt(i,o);
        }
    }
}
