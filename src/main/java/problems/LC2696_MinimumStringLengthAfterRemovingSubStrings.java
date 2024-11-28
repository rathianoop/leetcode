package problems;

public class LC2696_MinimumStringLengthAfterRemovingSubStrings {

    public static void main(String[] args) {
        System.out.println(minimumLength("ABFCACDB"));
    }

    public static int minimumLength(String s) {

        while(s.indexOf("AB") >=0 || s.indexOf("CD") >=0 ) {
            if(s.indexOf("AB") >=0) {
                s = s.substring(0, s.indexOf("AB")) + s.substring(s.indexOf("AB") + 2);
            }else if(s.indexOf("CD") >=0) {
                s = s.substring(0, s.indexOf("CD")) + s.substring(s.indexOf("CD") + 2);
            }
            else{
                return s.length();
            }
        }

        return s.length();

    }
}
