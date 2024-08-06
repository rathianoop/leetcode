package problems.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LC3_LongestSubstringWORepeatingChar {

    public static void main(String[] args) {
        System.out.println( lengthOfLongestSubstring("au") );


    }

    public static int lengthOfLongestSubstring(String s) {



        int L = 0, R=0;
        char[] charArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int length = charArray.length;
        if(length < 2){
            return length;
        }
        int maxLength = 0;

        while(R < length){
            map.put(charArray[R], map.getOrDefault(charArray[R], 0)+1);
            while(map.size() != R-L +1){
                map.put(charArray[L], map.get(charArray[L]) - 1);
                if(map.get(charArray[L]) == 0) {
                    map.remove(charArray[L]);
                }
                L++;
            }
            maxLength = Math.max(maxLength, R-L +1);
            R++;
        }

        return maxLength;

    }


}
