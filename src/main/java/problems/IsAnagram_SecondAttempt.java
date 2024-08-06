package problems;

import java.util.Collections;

public class IsAnagram_SecondAttempt {

    public static void main(String[] args) {
        //System.out.println(isAnagram("racecar", "carrace"));
        System.out.println(isAnagram("jar", "jam"));
    }

   public static boolean isAnagram(String s, String t) {

            if(s.length() != t.length()) return false;

            int[] charArray = new int[26];

            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();


            for(int i = 0; i < s.length(); i++){
                charArray[(int)s1[i]-97] = charArray[(int)s1[i]-97]+1;
                charArray[(int)t1[i]-97] = charArray[(int)t1[i]-97]-1;

            }

            for(int i : charArray){
                if(i < 0 || i > 0)
                    return false;
            }

            return true;

        }



}
