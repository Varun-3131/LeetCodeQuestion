package Main;

public class ImplementQueueUsingStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push the new element onto s1
        s1.push(x);

        // Move everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
