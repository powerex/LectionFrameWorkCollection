package lambda.generic;

public class App {

    public static void main(String[] args) {
        GenericFunctional<Integer> prod = (x) -> {
            int p = 1;
            while (x > 0) {
                p *= x % 10;
                x /= 10;
            }
            return p;
        };

        System.out.println(prod.func(123));
        System.out.println(prod.func(103));
        System.out.println(prod.func(999));


        GenericFunctional<String> oddCaps = (s) -> {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<s.length(); i++) {
                if (i % 2 == 0)
                    sb.append(Character.toUpperCase(s.charAt(i)));
                else
                    sb.append(s.charAt(i));
            }
            return sb.toString();
        };

        System.out.println(oddCaps.func("Hello world"));

    }

}
