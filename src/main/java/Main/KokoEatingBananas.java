package Main;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed=1;
        int maxSpeed=0;
        for(int pile:piles)
            maxSpeed=Math.max(maxSpeed,pile); //For maximum speed

        //Binary search
        while(minSpeed<maxSpeed){
            int mid=minSpeed+(maxSpeed-minSpeed)/2;
            if(canEat(piles,h,mid)){
                maxSpeed=mid;
            }else{
                minSpeed=mid+1;
            }
        }
        return minSpeed;
    }
    private boolean canEat(int[] piles,int h,int speed){
        int hours=0;
        for(int pile:piles){
            hours+=(int)Math.ceil((double)pile/speed);
        }
        return hours<=h;
    }
}
