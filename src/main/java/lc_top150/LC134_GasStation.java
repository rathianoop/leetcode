package lc_top150;

public class LC134_GasStation {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
        System.out.println(canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost){

        int gasCost = 0;
        int startingIndex = -1;
        for(int i = 0; i < gas.length-1; i++){
            gasCost += (gas[i] - cost[i]);
            if(gasCost >=  gas[i] ){
                startingIndex = i;
                break;
            }
        }


        return -1;

    }
}
