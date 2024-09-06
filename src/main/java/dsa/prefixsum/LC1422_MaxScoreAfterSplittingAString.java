package dsa.prefixsum;

public class LC1422_MaxScoreAfterSplittingAString {

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
    }

    private static int maxScore(String s){
        int maxScore = 0;

        char[] charArray = s.toCharArray();
        int[] leftCA = new int[s.length()];
        int[] rightCA = new int[s.length()];

        if(Integer.parseInt(String.valueOf(charArray[0])) == 0){
            leftCA[0] = 1;
            rightCA[0] = 0;
        }else{
            leftCA[0] = 0;
            rightCA[0] = 1;
        }

        for(int i = 1; i < charArray.length; i++){
            if(Integer.parseInt(String.valueOf(charArray[i])) == 0){
                leftCA[i] = leftCA[i-1] + 1;
                rightCA[i] = rightCA[i-1];
            }else{
                leftCA[i] = leftCA[i-1];
                rightCA[i] = rightCA[i-1]+1;
            }
        }

        for(int i = 0; i < charArray.length; i++){
            maxScore = Math.max(maxScore, leftCA[i]+rightCA[charArray.length-1]-rightCA[i]);
        }


        return maxScore;
    }
}
