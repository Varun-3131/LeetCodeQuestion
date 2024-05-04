package Main;

public class ImplementQueueUsingStacks {
    Stack<Integer> primaryStack;
    Stack<Integer> secondaryStack;


    int peek;

    public MyQueue() {
        primaryStack = new Stack<>();
        secondaryStack = new Stack<>();
    }

    public void push(int x) {

        if(primaryStack.isEmpty()) {
            peek = x;
        }

        primaryStack.push(x);
    }

    public int pop() {

        while(!primaryStack.isEmpty()){
            secondaryStack.push(primaryStack.pop());
        }


        int popped = secondaryStack.pop();


        if(!secondaryStack.isEmpty()) {
            peek = secondaryStack.peek();
        }


        while(!secondaryStack.isEmpty()){
            primaryStack.push(secondaryStack.pop());
        }


        return popped;
    }

    public int peek() {
        return peek;
    }

    public boolean empty() {
        return primaryStack.isEmpty();
    }
}
