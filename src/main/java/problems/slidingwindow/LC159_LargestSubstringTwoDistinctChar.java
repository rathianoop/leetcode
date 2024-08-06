package problems.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC159_LargestSubstringTwoDistinctChar {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringTwoDistinct("eceba"));
        System.out.println(lengthOfLongestSubstringTwoDistinct("ccaabbb"));
        System.out.println(lengthOfLongestSubstringTwoDistinct("bacc"));
    }

    public static int lengthOfLongestSubstringTwoDistinct(String s) {

        int left = 0;
        int right = 0;
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int maxLength = 0;
        int currentLength = 0;
        Map<Character, Integer> map = new HashMap();
        Set<Character> charSet = new HashSet<>();

        while(right < length){
            map.put(charArray[right], map.getOrDefault(charArray[right]+1, 1));
            if(map.size() < 3){
                right++;
                currentLength++;
            }
            maxLength = Math.max(maxLength, currentLength);
            while(map.size() > 2){
                map.remove(charArray[left]);
                left++;
                currentLength--;
            }
            maxLength = Math.max(maxLength, currentLength);

        }

        return maxLength;

    }
}
