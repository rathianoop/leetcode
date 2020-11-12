public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int integerToReverse = 1534236469;
        //System.out.println("output"+(1%10));
        System.out.println("the reversed number is "+(int)reverseInteger.reverseInteger(integerToReverse));
    }

    public int reverseInteger(int integerToReverse)
    {
        long reversedInteger = 0;
        boolean isNegative = Boolean.FALSE;
        if(integerToReverse < 0)
        {
            isNegative = true;
            integerToReverse *= -1;
        }

        while(integerToReverse > 0)
        {
            int modularIntToReverse = integerToReverse%10;
            reversedInteger = (reversedInteger*10) + modularIntToReverse;
            integerToReverse /= 10;
        }
        if(reversedInteger> Integer.MAX_VALUE)
        {
            return 0;
        }
        System.out.println("returning number "+reversedInteger);
        return isNegative?(int)(-1*reversedInteger):(int)reversedInteger;
    }
}
