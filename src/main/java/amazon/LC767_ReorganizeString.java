package amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC767_ReorganizeString {

    public static void main(String[] args) {
        System.out.println(reorganizeString("aab"));
        System.out.println(reorganizeString("aaab"));
        System.out.println(reorganizeString("baaba"));

    }

    public static  String reorganizeString(String s) {

        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<Character>((a,b) -> hashMap.get(b) - hashMap.get(a));
        queue.addAll(hashMap.keySet());

        StringBuilder res = new StringBuilder();
        while(queue.size() >= 2){
            char c1 = queue.poll();
            char c2 = queue.poll();

            res.append(c1).append(c2);

            hashMap.put(c1, hashMap.get(c1)-1);
            hashMap.put(c2, hashMap.get(c2)-1);

            if(hashMap.get(c1) > 0) queue.add(c1);
            if(hashMap.get(c2) > 0) queue.add(c2);
        }

        if(!queue.isEmpty()){
            char ch = queue.poll();
            if(hashMap.get(ch) > 1)  return "";
            res.append(ch);
        }

        return res.toString();


    }


}
