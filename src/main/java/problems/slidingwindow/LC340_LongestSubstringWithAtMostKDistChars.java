package problems.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LC340_LongestSubstringWithAtMostKDistChars {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {

        int L = 0, R = 0;
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap();
        while(R < length){
            map.put(charArray[R], map.getOrDefault(charArray[R], 0)+1);

            while(map.size() > k){
                map.put(charArray[L], map.get(charArray[L])-1);
                if(map.get(charArray[L]) == 0){
                    map.remove(charArray[L]);
                }
                L++;
            }
            maxLength = Math.max(maxLength, R-L+1);

            R++;
        }

        return maxLength;

    }


}
