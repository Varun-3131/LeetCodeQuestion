package Main;

public class ImplementTwoStacksInAnArray {
    int[] arr = new int[100];
    int i = -1;
    int j = arr.length;
    twoStacks()
    {
        for(int i=0; i<j; i++){
            arr[i] = -1;
        }
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        arr[++i] = x;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
        arr[--j] = x;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(i == -1)
            return -1;

        int x = arr[i];
        arr[i] = -1;
        i--;
        return x;

    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(j == 100)
            return -1;

        int x = arr[j];
        arr[j] = -1;
        j++;
        return x;
    }
}
