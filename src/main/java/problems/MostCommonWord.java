package problems;

import java.util.*;

public class MostCommonWord
{
  public static void main(String[] args)
  {

    Map<String, Integer> countMap = new HashMap();
    String inString = "a, a, a, a, b,b,b,c, c";
    //String[] words = inString.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    String[] words = inString.replaceAll("[^a-zA-Z]", " ").toLowerCase().split("\\s+");
    String[] banned = new String[]{"a"};
    Set<String> bannedWords = new HashSet<String>();
    for(String bannedWord : banned)
    {
      bannedWords.add(bannedWord);
    }

    String outputWord = "";
    int maxCount= 0;
    for(String word : words)
    {
      if(!bannedWords.contains(word))
      {
        if (!countMap.containsKey(word))
        {
          countMap.put(word, 1);
        }
        else
        {
          countMap.put(word, countMap.get(word) + 1);
        }
      }
    }

    for(Map.Entry<String, Integer> entry : countMap.entrySet())
    {

      if(entry.getValue() > maxCount)
      {
        outputWord = entry.getKey();
        maxCount = entry.getValue();
      }
    }

    System.out.println(outputWord +" "+maxCount);
  }
}
