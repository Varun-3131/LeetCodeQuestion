package Main;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int[] right = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            right[i] = s.isEmpty() ? heights.length : s.peek();
            s.push(i);
        }
        while(!s.isEmpty()){
            s.pop();
        }
        int[] left = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            left[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        int max=0;
        for (int i=0;i<heights.length;i++){
            int width=right[i]-left[i]-1;
            int currArea=heights[i]*width;
            max=Math.max(max,currArea);
        }
        return max;
    }
}
