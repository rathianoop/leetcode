package lc_top150.greedy;

public class LC134_GasStation {

    public static void main(String[] args) {

        System.out.println();

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int sum = 0, total = 0, position = 0;

        for(int i = 0; i < gas.length; i++){
            sum += gas[i] - cost[i];
            if(sum < 0){
                total += sum;
                sum = 0;
                position = i +1;
            }
        }

        return total >=0?position:-1;
    }
}
