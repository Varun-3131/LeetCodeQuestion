package Main;

public class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int num=x;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        if(num%sum==0) return sum;
        else return -1;
    }
}
