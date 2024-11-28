package lc_top150;

import java.util.*;

public class LC49_GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(getGroupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> getGroupAnagrams(String[] strs) {

        List<List<String>> returningList = new ArrayList();

        Map<Integer, List<String>> hashMap = new HashMap();

        for(String str : strs){
            int[] charArray = new int[26];
            for(int i = 0; i < str.length(); i++){
                charArray[str.charAt(i)-'a']++;
            }

            int hashCode = Arrays.hashCode(charArray);

            if(hashMap.containsKey(hashCode)){
                hashMap.get(hashCode).add(str);
            }else{
                List<String> list = new ArrayList();
                list.add(str);
                hashMap.put(hashCode, list);
            }
        }

        for(Map.Entry<Integer, List<String>> entry : hashMap.entrySet()){
            returningList.add(entry.getValue());
        }

        return returningList;
    }

}
