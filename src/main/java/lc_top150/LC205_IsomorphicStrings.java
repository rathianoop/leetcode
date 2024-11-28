package lc_top150;

import java.util.HashMap;
import java.util.Map;

public class LC205_IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphicString("badc", "baba"));
    }

    public static boolean  isIsomorphicString(String s, String t){

        if(t.length() != s.length()) return false;

        Map<Character, Character> swapMap = new HashMap();

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) != t.charAt(i)){
                if(swapMap.containsKey(s.charAt(i))){
                    if(t.charAt(i) != swapMap.get(s.charAt(i))){
                        return false;
                    }
                }else{
                    swapMap.put(s.charAt(i), t.charAt(i));
                }
            }else{
                swapMap.put(s.charAt(i), s.charAt(i));
            }
        }

        return true;
    }
}
