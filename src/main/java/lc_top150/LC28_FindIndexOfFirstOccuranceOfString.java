package lc_top150;

public class LC28_FindIndexOfFirstOccuranceOfString {

    public static void main(String[] args) {
        System.out.println(findFirstOccurance("sadbutsad", "sad"));
    }

    public static int findFirstOccurance(String haystack, String needle) {

        if(needle.length() <= haystack.length()){

            for(int i = 0; i < haystack.length()-needle.length(); i++){
                if(haystack.startsWith(needle, i)){
                    return i;
                }
            }

        }

        return -1;

    }
}
