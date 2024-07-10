package problems;

public class LC459_RepeatedSubstringPattern {

    public static void main(String[] args) {
        System.out.println("abab".indexOf("ab"));


        //System.out.println(repeatedSubstringPattern("abab"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();
        System.out.println(s.indexOf("ab"));

        char[] array = s.toCharArray();
        int midpoint = s.length()/2;
        String sub = s.substring(0, midpoint);
        for(int i=1; i<array.length; i++){
            if(array[i-1] != array[i]){
                sb.append(array[i-1]);
            }
            if(s.indexOf(sb.toString()) > 0){
                return true;
            }
        }
    return false;

    }
}
