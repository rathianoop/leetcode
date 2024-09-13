package dsa.prefixsum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC848_ShiftingLetters {

    public static void main(String[] args) {
        System.out.println(shiftingLetters("abc", new int[]{3,5,9}));
    }

    public static String shiftingLetters(String s, int[] shifts) {

        char[] charArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Map<Character, Integer> charMap = new HashMap();
        charMap.put('a', 0);
        charMap.put('b', 1);
        charMap.put('c', 2);
        charMap.put('d', 3);
        charMap.put('e', 4);
        charMap.put('f', 5);
        charMap.put('g', 6);
        charMap.put('h', 7);
        charMap.put('i', 8);
        charMap.put('j', 9);
        charMap.put('k', 10);
        charMap.put('l', 11);
        charMap.put('m', 12);
        charMap.put('n', 13);
        charMap.put('o', 14);
        charMap.put('p', 15);
        charMap.put('q', 16);
        charMap.put('r', 17);
        charMap.put('s', 18);
        charMap.put('t', 19);
        charMap.put('u', 20);
        charMap.put('v', 21);
        charMap.put('w', 22);
        charMap.put('x', 23);
        charMap.put('y', 24);
        charMap.put('z', 25);



        char[] inputStrArr = s.toCharArray();
        char[] adjustedArray = new char[inputStrArr.length];

        for(int i = 0; i < shifts.length; i++){
            for(int j = 0; j <=i; j++){
                int number = charMap.get(inputStrArr[j]);
                int position = number + shifts[i];
                if(position > 25){
                    position -= 25;
                }
                adjustedArray[j] = charArray[position];
            }

            inputStrArr = adjustedArray;
        }
        return inputStrArr.toString();
    }
}
