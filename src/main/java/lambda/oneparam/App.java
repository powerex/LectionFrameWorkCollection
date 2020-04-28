package lambda.oneparam;

public class App {

    public static void main(String[] args) {

        System.out.println("Odd");
        NumberCheck isOdd;
        isOdd = (n) -> n % 2 == 0;
        if (isOdd.is(100)) System.out.println("No"); else System.out.println("Yes");
        if (isOdd.is(101)) System.out.println("No"); else System.out.println("Yes");
        if (isOdd.is(102)) System.out.println("No"); else System.out.println("Yes");

        System.out.println("Even");
        NumberCheck isEven;
        isEven = (d) -> d % 2 != 0;
        if (isEven.is(100)) System.out.println("No"); else System.out.println("Yes");
        if (isEven.is(101)) System.out.println("No"); else System.out.println("Yes");
        if (isEven.is(102)) System.out.println("No"); else System.out.println("Yes");

        System.out.println("Positive");
        NumberCheck isPositive = (k) -> k > 0;
        if (isPositive.is(100)) System.out.println("Yes"); else System.out.println("No");
        if (isPositive.is(-51)) System.out.println("Yes"); else System.out.println("No");
        if (isPositive.is(102)) System.out.println("Yes"); else System.out.println("No");

        System.out.println("Sum digits");
        NumberCalc sum = (m) -> {
            int s = 0;
            while (m > 0) {
                s += m % 10;
                m /= 10;
            }
            return s;
        };
        System.out.println(sum.calc(123));
        System.out.println(sum.calc(456));
        System.out.println(sum.calc(999));
    }

}
