package lc_top150;

import java.util.HashMap;
import java.util.Map;

public class LC12_IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(integerToRoman(3749));
    }

    public static String integerToRoman(int num){

        Map<Integer, Character> map = new HashMap();
        map.put(1, 'I');
        map.put(5, 'V');

        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');

        StringBuilder sb = new StringBuilder();
        String str = "";
        int divideBy = 10;
        while(num > 0){

            int currentNum = num%divideBy;
            num -= currentNum;

            if(map.get(currentNum) != null){
                Character c =  map.get(currentNum);
                str = String.valueOf(c).concat(str);

            }else if(currentNum < 5 && currentNum > 1){
                if(currentNum +1 == 5){
                    str = "";
                }
            }

            System.out.println(currentNum);
            divideBy *=10;

        }
        return sb.toString();
    }
}
