package amazon;

public class LC875_KokoEatingBananas {

    public static void main(String[] args) {

    }

    public static int minEatingSpeed(int[] piles, int h){

        int bananas = 1;
        int j = Integer.MAX_VALUE;

        while(bananas < j){
            int k = bananas + (j-bananas)/2;

            int time = 0;
            for(int i = 0; i < piles.length; i++) {
                if (piles[i] == k) {
                    time++;
                } else {
                    time += (piles[i] + k - 1) / 2;
                }
            }
            if(time > h){
                bananas = k+1;
            }else{
                j = k;
            }
        }
        return bananas;
    }
}
