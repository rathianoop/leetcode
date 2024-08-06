package problems;

import java.util.*;

public class LC49_GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> anagramList = new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(String str : strs){
            char[] sortedKey = str.toCharArray();
            Arrays.sort(sortedKey);
            String key = String.valueOf(sortedKey);
            List<String> mapList = hashMap.getOrDefault(key, new ArrayList<String>());
            mapList.add(str);
            hashMap.put(key, mapList);

        }

        for(Map.Entry<String, List<String>> entry : hashMap.entrySet()){
            anagramList.add(entry.getValue());
        }

    return anagramList;
    }
}
