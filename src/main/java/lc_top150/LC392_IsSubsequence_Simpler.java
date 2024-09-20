package lc_top150;

public class LC392_IsSubsequence_Simpler {

    public static void main(String[] args) {
        System.out.println(isSubsequence("acb", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {

        boolean isSubsequence = false;
        int sLen = 0, tLen = 0;

        while((sLen < s.length()) && tLen < t.length()) {
            if(s.charAt(sLen) == t.charAt(tLen)){
                sLen++;
            }
            tLen++;
            if(sLen >=s.length()){
                return true;
            }
        }

        return isSubsequence;

}
}
