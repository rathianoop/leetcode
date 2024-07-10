package problems;

import java.util.Arrays;

public class LC1768_MergeStringAlternatively {
    public static void main(String[] args) {
        System.out.println(mergeString("abc", "pqr"));
        System.out.println(mergeString("ab", "pqrs"));
    }

    public static String mergeString(String word1, String word2){
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();

        int i=0;
        int j = 0;
        int index = 0;
        int len1 = char1.length;
        int len2 = char2.length;
        char[] returningarray = new char[len1+len2];

        System.out.println(Math.max(word1.length(), word2.length()));


        while(i < len1 && j < len2){
            returningarray[index] = char1[i];
            returningarray[index+1] = char2[j];
            i++;j++;
            index +=2;
        }

        if(i < len1){
            while(i<len1){
                returningarray[index] = char1[i];
                i++; index++;
            }
        }
        if(j < len2){
            while(j<len2){
                returningarray[index] = char2[j];
                j++; index++;
            }
        }

        return String.valueOf(returningarray);
    }



}
