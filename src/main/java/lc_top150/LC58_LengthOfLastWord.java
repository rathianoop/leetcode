package lc_top150;

public class LC58_LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastString("   fly me   to   the moon  "));
    }

    public static int lengthOfLastString(String s){
        String[] array = s.split(" +");
        return array[array.length-1].toCharArray().length;
    }
}
