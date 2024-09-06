package java8;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {


        Function<Integer, Integer> functonCalc = num -> num*2;
        Function<Integer, Integer> funcCube = num -> num*num*num;
        System.out.println(functonCalc.compose(funcCube).apply(5));
        System.out.println(functonCalc.andThen(funcCube).apply(5));

    }


}
