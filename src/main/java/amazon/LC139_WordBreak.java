package amazon;

import java.util.*;

public class LC139_WordBreak {

    public static void main(String[] args) {
        System.out.println(workBreak("leetcode", Arrays.asList("leet", "code")));
        System.out.println(workBreak("applepenapple", Arrays.asList("apple","pen")));
        System.out.println(workBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));

    }

    private static boolean workBreak(String s, List<String> wordDict){

        PriorityQueue<String> queue = new PriorityQueue<String>((a, b) -> b.length()-a.length());
        queue.addAll(wordDict);
        while(!queue.isEmpty()){
            String word = queue.poll();
            if(s.indexOf(word) != -1){
                s = s.substring(0, s.indexOf(word))+ s.substring(s.indexOf(word)+word.length());
            }
            if(s.indexOf(word) != -1){
                queue.add(word);
            }
        }

        return s.length() == 0;
    }
}
