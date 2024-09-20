package lc_top150;

public class LC151_ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("the sky is blue"));
    }

    public static String reverseString(String s){
        String[] array = s.split(" ");
        StringBuffer sb = new StringBuffer();
        sb.append(array[array.length-1].trim());
        for(int i = array.length-2; i >=0; i--){
            sb.append(" ");
            sb.append(array[i].trim());
        }

        return sb.toString().replaceAll("^\\s+", "").replaceAll("\\s+$", "");
    }
}
