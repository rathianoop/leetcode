package problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {

        char[] romanArray = s.toCharArray();
        Map<Character, Integer> valueMap = new HashMap();
        valueMap.put('I', 1);
        valueMap.put('V', 5);
        valueMap.put('X', 10);
        valueMap.put('L', 50);
        valueMap.put('C', 100);
        valueMap.put('D', 500);
        valueMap.put('M', 1000);

        int finalCount = 0;
        for(int i = 0; i < romanArray.length; i++){

            finalCount +=valueMap.get(romanArray[i]);
        }

        return finalCount;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        String myString = "hello";

    }





}
