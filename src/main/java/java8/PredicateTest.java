package java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        Predicate<Integer> numTest = num -> num%2 == 0;
        System.out.println(numTest.test(10));
        System.out.println(numTest.test(9));

        BiPredicate<Integer, Integer> numTest2 = (num1, num2) -> num1 > num2;

        System.out.println(numTest2.test(5, 10));
        System.out.println(numTest2.test(15, 10));


    }
}
