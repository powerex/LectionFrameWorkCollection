package lambda.methods;

public class StringOps {
    static String strReverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
