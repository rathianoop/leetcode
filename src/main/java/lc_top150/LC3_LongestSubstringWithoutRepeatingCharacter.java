package lc_top150;

import java.util.HashSet;
import java.util.Set;

public class LC3_LongestSubstringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int L = 0, R = 0;
        int maxLen = 0;
        Set<Character> seen = new HashSet();
        while(R < s.length()){
            if(!seen.contains(s.charAt(R))){
                seen.add(s.charAt(R));
                R++;
                maxLen = Math.max(maxLen,seen.size());
            }else{
                seen.add(s.charAt(R));
                L++;
            }

        }

        return maxLen;



    }
}
