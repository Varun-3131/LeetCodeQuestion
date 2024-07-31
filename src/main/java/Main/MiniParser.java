package Main;

public class MiniParser {
    public NestedInteger deserialize(String s) {
        Deque<NestedInteger> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '['){
                NestedInteger temp = new NestedInteger();
                stack.offerFirst(temp);
            }
            else if(Character.isDigit(s.charAt(i)) || s.charAt(i) == '-'){
                int start = i;
                while(start < s.length() && s.charAt(start) != ',' && s.charAt(start) != ']'){
                    start++;
                }
                String str = s.substring(i, start);
                int value = Integer.parseInt(str);
                NestedInteger top = stack.pollFirst();
                NestedInteger num = new NestedInteger(value);
                if(top == null){
                    top = num;
                }
                else{
                    top.add(num);
                }
                stack.offerFirst(top);
                i = start - 1;
            }
            else if(s.charAt(i) == ']'){
                NestedInteger temp = stack.peekFirst();
                if(stack.size() > 1){
                    stack.pollFirst();
                    NestedInteger next = stack.pollFirst();
                    next.add(temp);
                    stack.offerFirst(next);
                }
            }
        }
        return stack.peekFirst();
    }
}
