package lambda.methods;

import java.util.Arrays;
import java.util.List;

public class App {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inS = "Hello World!";
        String outS = stringOp(StringOps::strReverse, inS);
        System.out.println(outS);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.forEach(x -> System.out.println(x));

        numbers.forEach(System.out::println);
    }

}
