package lc_top150;

import java.util.*;

public class LC127_WordLadder {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"ymann", "yycrj", "oecij", "ymcnj", "yzcrj", "yycij", "xecij", "yecij", "ymanj", "yzcnj", "ymain"});
        System.out.println(ladderLength("ymain", "oecij", list));

    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> wordSet = new HashSet();
        for(String str : wordList){
            wordSet.add(str);
        }

        if(!wordSet.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList();
        queue.offer(beginWord);
        int level = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size ; i++){
                String word = queue.poll();
                char[] word_array = word.toCharArray();
                for(int j = 0; j < word_array.length; j++){
                    char orig_char = word_array[j];
                    for(char c='a'; c < 'z'; c++){
                        if(word_array[j] == c) continue;
                        word_array[j] = c;
                        String new_word = String.valueOf(word_array);
                        if(endWord.equals(new_word)){
                            return level+1;
                        }
                        if(wordSet.contains(new_word)){
                            queue.offer(new_word);
                            wordSet.remove(new_word);
                        }
                    }
                    word_array[j] = orig_char;
                }
            }

            level++;
        }
        return 0;

    }
}
