package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEncodeDecode {


    public static String encode(List<String> strs){
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            char[] cA = str.toCharArray();
            int hashCode = Arrays.hashCode(cA)*32;
            sb.append(String.valueOf(hashCode));
            sb.append(String.valueOf((int)'-'));
        }

        sb.substring(0, sb.lastIndexOf(String.valueOf((int)'-')));
        return sb.toString();

    }

    public static List<String> decode(String encodedString){
        List<String> returningList = new ArrayList<>();
        String[] strs = encodedString.split(String.valueOf((int)'-'));

        for(String str  : strs){
            int hashCode = Integer.valueOf(str)/32;
            

        }

        return returningList;
    }


}
