package problems;

import java.util.*;

public class LC49_GroupAnagrams_SecondAttempt {

    public static void main(String[] args) {

        /*System.out.println(Arrays.hashCode(new char[]{'a', 'b', 'a'}));
        System.out.println(Arrays.hashCode(new char[]{'a', 'a', 'b'}));
        System.out.println(Arrays.hashCode(new char[]{'b', 'a', 'a'}));
*/
        System.out.println(groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs){

        List<List<String>> returingList = new ArrayList<>();
        Map<Integer, List<String>> listMap = new HashMap<>();

        for(String str : strs){
            int[] chars = new int[26];
            for (int i = 0; i < str.length(); i ++) {
                chars[str.charAt(i) - 'a'] ++;
            }
            int hashCode = Arrays.hashCode(chars);

            if(listMap.containsKey(hashCode)){
                listMap.getOrDefault(hashCode, new ArrayList<String>()).add(str);
            }else{
                ArrayList list  = new ArrayList<String>();
                list.add(str);
                listMap.put(hashCode, list);
            }
        }

        for(Map.Entry entry : listMap.entrySet()){
            returingList.add((List<String>)entry.getValue());
        }
        return returingList;
    }
}
