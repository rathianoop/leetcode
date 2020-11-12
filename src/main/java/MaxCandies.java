import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCandies {

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Kids With the Greatest Number of Candies.
    Memory Usage: 39.1 MB, less than 26.26% of Java online submissions for Kids With the Greatest Number of Candies.
     */

    public static void main(String[] args) {
        int[] candies = new int[]{2,3,5,1,3};
        List<Boolean> hasMaxCandies = new ArrayList();
        int extraCandies = 2;
        int maxCandies = 0;
        for(int numberOfCandies : candies)
        {
            if(maxCandies < numberOfCandies) {
                maxCandies = numberOfCandies;
            }
        }
        for(int childCount = 0; childCount < candies.length; childCount++)
        {
            if ((candies[childCount] + extraCandies) >= maxCandies) {
                hasMaxCandies.add(Boolean.TRUE);
            } else {
                hasMaxCandies.add(Boolean.FALSE);
            }
        }

        for(Boolean hasMaximumCandies : hasMaxCandies)
            System.out.println(hasMaximumCandies);

    }
}
