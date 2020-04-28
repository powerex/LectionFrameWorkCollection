package lambda.noparam;

public class App {

    public static void main(String[] args) {

        Numbering rand;
        rand = () -> Math.random() * 20 - 10;

        System.out.println(String.format("%5.2f",rand.getValue()));
        System.out.println(String.format("%5.2f",rand.getValue()));
        System.out.println(String.format("%5.2f",rand.getValue()));

        Stringing randString;
        randString = () -> {
            double x = Math.random() * 20 - 10;
            String s = String.format("%5.2f",x);
            return s;
        };

        System.out.println(randString.getValue());
        System.out.println(randString.getValue());
        System.out.println(randString.getValue());
    }

}
