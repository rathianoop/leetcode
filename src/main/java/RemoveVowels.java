import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

    public static void main(String[] args) {

        String toTest = "remove vowels";
        StringBuilder returningString = new StringBuilder();
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        char[] toTestChars = toTest.toCharArray();
        for(char character : toTestChars)
        {
            if(!vowels.contains(character))
            {
                returningString.append(character);
            }
        }
        System.out.println("Final String without vowels is "+returningString.toString());
    }


}
