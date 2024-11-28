package lc_top150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LS212_WordSearch_II {

    public static void main(String[] args) {

    }

    static class Trie{
        Map<Character, Trie> map = new HashMap<>();
        boolean isWord = false;
    }
    static List<String> result = new ArrayList();
    static int m, n;
    static char[][] grid;
    static boolean[][] visited;
    static Trie trie = new Trie();
    public static List<String> findWords(char[][] board, String[] words) {

        m = board.length;
        n = board[0].length;
        grid = board;

        //constructing the trie with input words
        for(String word : words){
            Trie node = trie;
            char[] cArray = word.toCharArray();
            for(int i = 0; i < cArray.length; i++){
                char c = cArray[i];
                if(!trie.map.containsKey(c)){
                    node.map.put(c, new Trie());
                }
                node = node.map.get(c);
            }

            //Storing thie word in the Trie.
            node.isWord = true;
        }

        for(int row = 0; row < board.length; ++row){
            for(int column = 0; column < board[row].length; ++column){
                char c = board[row][column];
                visited = new boolean[m][n];
                dfs(row, column, new StringBuilder(), trie);
            }
        }

        return result;
    }


    private static void dfs(int row, int column, StringBuilder sb, Trie trie){

        if(row < 0 || column < 0 || row == m || column == n) return;
        if(visited[row][column]) return;

        char c = grid[row][column];
        if(!trie.map.containsKey(c)) return;

        sb.append(c);
        trie = trie.map.get(c);
        visited[row][column] = true;

        if(trie.isWord){
            result.add(sb.toString());
            trie.isWord = false;
        }

        dfs(row-1, column, sb, trie);
        dfs(row+1, column, sb, trie);
        dfs(row, column-1, sb, trie);
        dfs(row, column+1, sb, trie);

        sb.setLength(sb.length() -1);
        visited[row][column] = false;
    }

}
