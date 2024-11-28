package lc_top150;

import java.util.HashSet;
import java.util.Set;

public class LC3_LongestSubstringWithoutRepeatingCharacters_SA {

    public static void main(String[] args) {
        System.out.println(longest("abcabcbb"));
        System.out.println(longest("bbbbb"));
        System.out.println(longest("pwwkew"));
    }

    public static int longest(String str){

        if(str.length() < 2) return str.length();
        int longestLen = 1;
        Set<Character> set = new HashSet();

        int left = 0;
        set.add(str.charAt(left));
        int right = 0;

        for(int i = 1; i < str.length(); i++){
            if(!set.add(str.charAt(i))){
                while (!set.add(str.charAt(i))){
                    set.remove(str.charAt(left));
                    left++;
                }
            }
            longestLen = Math.max(longestLen, i-left+1);

        }

        return longestLen;



    }
}
