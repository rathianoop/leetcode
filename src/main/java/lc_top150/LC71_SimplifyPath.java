package lc_top150;

import java.util.Stack;

public class LC71_SimplifyPath {

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println("here");
    }

    public static String simplifyPath(String path){

        String[] str = path.split("/");

        Stack<String> stack = new Stack();
        for(String s : str){
            if(s.equals("..")  && !s.isEmpty()){
                stack.pop();
            }else{
                stack.push(s);
            }
        }
        String returningString = "";
        while(!stack.isEmpty() ){
            String checkString = stack.pop();
            if(!checkString.isEmpty()){

                returningString = "/"+checkString+returningString;

            }
        }
        if(returningString.isEmpty()) return "/";

        return returningString;

    }
}
