package problems;

public class IsAnargam {

    public static boolean isAnargam(String s1, String s2){

        int[] frequencyCounter = new int[26];
        char[] s1harArray = s1.toCharArray();
        char[] s2charArray = s2.toCharArray();

        for(char character : s1harArray){
            frequencyCounter[character - 'a']++;
        }

        for(char character : s2charArray){
            frequencyCounter[character - 'a']--;
            if(frequencyCounter[character - 'a'] < 0)
                return false;
        }

        for(int counter : frequencyCounter){
            if(counter > 0) return false;
        }

    return true;
    }


    public static void main(String[] args) {
      //  System.out.println(isAnargam("anagram", "nagaram"));
       // System.out.println(isAnargam("rat", "cat"));
        System.out.println(isAnargam("aa", "a"));
    }


}
