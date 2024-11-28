package twopointers;

public class LongestPAlindromicSubString {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {


        if(s == null || s.isEmpty()) return s;
        int left = 0, right = 0;

        for(int i = 0; i < s.length(); i++) {
            left = getLength(s, i, i);
            right = getLength(s, i, i + 1);
            int len = Math.max(left, right);
            System.out.println("I am here "+len + " right : "+right+" left : "+left);

            if(len > right-left){
                left = i - ((len-1)/2);
                right = i + (len/2);
            }
        }
        String str = s.substring(left, right+1);
        return str;
    }

    public static int getLength(String s, int left, int right) {

        if(left < 0 || right > s.length() || left > right){
            return 0;
        }

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right-left-1;





    }
}
