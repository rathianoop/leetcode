package lc_top150;

public class LC392_IsSubsequence_SA {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String str, String bigString){
        int strPointer = 0;
        int bigPointer = 0;

        while(strPointer < str.length() && bigPointer < bigString.length()){

            if(str.charAt(strPointer) == bigString.charAt(bigPointer)){
                strPointer++;
            }
            bigPointer++;
        }
        return strPointer == str.length();


    }
}
