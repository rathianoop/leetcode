import java.util.*;

public class TopKElementInList {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topElement(new int[]{1,2,2,3,3,3}, 2)));
    }

    public static int[] topElement(int[] nums, int k){

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>( (a, b) -> b.getValue() - a.getValue());

        for(Map.Entry<Integer, Integer> kv : frequencyMap.entrySet()){
            pq.add(kv);
        }

        int[] returningArray = new int[k];

        for(int i = 0; i < k; i++){
            returningArray[i] = pq.poll().getKey();
        }

        return returningArray;



    }
}
