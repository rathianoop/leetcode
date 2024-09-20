package lc_top150;

public class LC392_IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("acb", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {

        if(s.length() > t.length()) return false;

        char[] sArray = s.toCharArray();
        boolean isSubsequence = true;

        char[] tArray = t.toCharArray();
        int tLength = 0;


        for(int i = 0; i < sArray.length; ){

            if(tLength < t.length() && sArray[i] == tArray[tLength]){
                i++;
            }else if(tLength >= t.length()-1){
                return false;
            }
            tLength++;
    }

    return isSubsequence;



}
}
