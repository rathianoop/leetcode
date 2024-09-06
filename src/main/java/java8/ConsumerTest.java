package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class ConsumerTest {

    private static Map<Character, Integer> romanChar = new HashMap();
    public static void main(String[] args) {


        System.out.println(5%3);
        System.out.println(5%5);
        System.out.println(15%5%3);



    }

    private static void populateMap(){
        romanChar.put('I', 5);
    }
}
