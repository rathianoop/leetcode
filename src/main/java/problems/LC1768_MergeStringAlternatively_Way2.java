package problems;

public class LC1768_MergeStringAlternatively_Way2 {
    public static void main(String[] args) {
        System.out.println(mergeString("abc", "pqr"));
        System.out.println(mergeString("ab", "pqrs"));
    }

    public static String mergeString(String word1, String word2){
       StringBuilder sb = new StringBuilder();

       int maxLength = Math.max(word1.length(), word2.length());
       for(int i = 0; i < maxLength; i++){
           if(i<word1.length()){
               sb.append(word1.charAt(i));
           }
           if(i<word2.length()){
               sb.append(word2.charAt(i));
           }
       }
       return sb.toString();
    }
}
