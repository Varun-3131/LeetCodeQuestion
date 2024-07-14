package Main;

public class WaterAndJugProblem {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(jug1Capacity+jug2Capacity<targetCapacity){
            return false;
        }
        int a=gcd(jug1Capacity, jug2Capacity);
        if(targetCapacity%a==0){
            return true;
        }
        else{
            return false;
        }
    }
    private int gcd(int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}
