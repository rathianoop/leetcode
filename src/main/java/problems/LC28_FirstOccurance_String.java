package problems;

public class LC28_FirstOccurance_String {

    public static void main(String[] args) {

        System.out.println(firstIndex("a", "a"));
        System.out.println(firstIndex_SecondWay("a", "a"));
    }

    public static int firstIndex(String haystack, String needle){
        if(needle.length() <= haystack.length()){
            if(haystack.indexOf(needle) >= 0){
                return haystack.indexOf(needle);
            }
        }

        return -1;
    }

    public static int firstIndex_SecondWay(String haystack, String needle){
        if(needle.length() <= haystack.length()){

            for(int i =0; i <= haystack.length()-needle.length(); i++){
                if(haystack.substring(i, i+needle.length()).equals(needle))
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
