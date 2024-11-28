package lc_top150;

public class LC125_ValidPalindrome_SA {

    public static void main(String[] args) {
        System.out.println(isValid("A man, a plan, a canal: Panama"));
    }

    public static boolean isValid(String str){

        String formattedString = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = formattedString.length()-1;

        while(left < right){
            if(formattedString.charAt(left) != formattedString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
