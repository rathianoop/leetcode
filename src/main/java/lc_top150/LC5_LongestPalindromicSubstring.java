package lc_top150;

public class LC5_LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("racecar"));
    }

    public static String longestPalindrome(String s) {

        if(s == null || s.length() == 0) return "";
        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            int len1 = explandFromMiddle(s, i, i);
            int len2 = explandFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);

            if(len > end-start){
                start = i - ((len - 1)/2);
                end = i + ((len)/2);
            }

        }
        return s.substring(start, end+1);
    }

    private static int explandFromMiddle(String s, int left, int right) {

        if(s == null || left > right) return 0;

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left-1;

    }
}
