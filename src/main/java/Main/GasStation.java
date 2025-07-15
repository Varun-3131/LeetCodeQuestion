package Main;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int totalCost=0;

        for(int i=0;i<gas.length;i++){
            totalGas=totalGas +gas[i];
            totalCost=totalCost+ cost[i];
        }
        if(totalGas<totalCost){
            return -1;
        }

        int currentGas=0;
        int startingIndex=0;

        for(int i=0;i<gas.length;i++){
            currentGas+=gas[i]-cost[i];

            if(currentGas<0){
                startingIndex=i+1;
                currentGas=0;
            }
        }
        return startingIndex;
    }
}
