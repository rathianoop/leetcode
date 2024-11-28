package lc_top150;

public class LC242_ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length()) return false;
        int[] counter = new int[26];

        for(int i = 0; i < s1.length(); i++){
            counter[s1.charAt(i)-'a'] =counter[s1.charAt(i)-'a']+1;
            counter[s2.charAt(i)-'a'] =counter[s2.charAt(i)-'a']-1;
        }

        for(int num : counter){
            if(num != 0)
                return false;
        }

        return true;
    }
}
