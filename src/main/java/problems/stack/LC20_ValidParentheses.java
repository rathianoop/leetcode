package problems.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC20_ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {

        boolean isValid = false;
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            if(map.containsKey(s.charAt(i))){
                char c = stack.isEmpty() ? '#': stack.pop();
                if(c != map.get(s.charAt(i))){
                    return false;
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }



        return stack.isEmpty();

    }
}
