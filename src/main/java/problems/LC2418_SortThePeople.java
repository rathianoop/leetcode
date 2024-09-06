package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC2418_SortThePeople {

    public static void main(String[] args) {

    }

    public static String[] sortPeople(String[] names, int[] heights){
        Map<Integer, String> map = new HashMap();
        String[] returningArray = new String[names.length];
        for(int i = 0; i < heights.length; i++){
            map.put(heights[i], names[i]);
        }

        PriorityQueue<Map.Entry<Integer, String>> pq = new PriorityQueue<>((a,b) -> b.getKey() - b.getKey());

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            pq.add(entry);
        }

        for(int i = 0; i < names.length; i++){
            returningArray[i] = pq.poll().getValue();
        }

        return returningArray;



    }
}
