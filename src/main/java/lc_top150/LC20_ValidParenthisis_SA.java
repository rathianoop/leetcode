package lc_top150;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC20_ValidParenthisis_SA {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("()[{]}"));
    }

    public static boolean isValid(String str){

        Map<Character, Character> map = new HashMap();
        boolean isValid = false;
        Stack<Character> stack = new Stack<>();

        char[] array = str.toCharArray();

        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        for(char c : array){
            if(map.containsKey(c)){
                char topElement = stack.isEmpty()? '#':stack.pop();
                if(topElement != map.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }




        }

       return stack.isEmpty();
    }
}
