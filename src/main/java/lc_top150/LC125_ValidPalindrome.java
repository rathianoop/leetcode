package lc_top150;

public class LC125_ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s){

        char[] array = s.toLowerCase().toCharArray();
        int i = 0;
        int j = array.length -1;

        while(i <j){
            System.out.println("j "+(array[j] - 'a')+" value "+array[j]);
            System.out.println("i "+(array[i] - 'a')+" value "+array[i]);
            if((array[j] - 'a') >=26 ) {j--; continue;}
            if((array[i] - 'a') >=26 ) {i++; continue;}
            if(array[i] != array[j]){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;

    }
}
