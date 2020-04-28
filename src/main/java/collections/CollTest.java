package collections;

import java.sql.ClientInfoStatus;
import java.util.*;

public class CollTest {

    public static void main(String[] args) {
/*

        List<Integer> list = new ArrayList<Integer>();
        System.out.println(list.size());
        if (list.isEmpty()) System.out.println("Empty");
        list.add(23);
        list.add(343);
        list.add(453);
        list.add(53);

        System.out.println(list.size());

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        int n = 343;
        if (list.contains(n)) System.out.println(n + " in list"); else System.out.println(n + " not in list");

        list.remove(new Integer(343));

        System.out.println("After remove");
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
 */

        /*
        List<String> lines = new ArrayList<>();

        lines.add("Hello");
        lines.add("Ангелина");
        lines.add("Yuri");
        lines.add("Alex");
        lines.add("Alina");
        lines.add("Ангелина");
        lines.set(1, "Something");  // lines[1] = "Something"

        String it = lines.get(2);

//        Collections.sort(lines);
//        Collections.reverse(lines);

        List<String> subLines = lines.subList(1,3);  // [1; 3)

        it = "He";
        System.out.println("it: " + it);

        for (String s: lines) {
            System.out.println(s);
        }

*/

/*
        List<Some> some = new ArrayList<>();
        some.add(new Some(23));
        some.add(new Some(32));
        some.add(new Some(12));

        Some it = some.get(1);
        it.setX(56);

        for (Some n: some) {
            System.out.println(n);
        }

        Queue<Double> queue;
*/

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kiev", 4000000);
        map.put("Dnipro", 1000000);
        map.put("Kharkiv", 1500000);

        System.out.println(map.get("Kiev"));

        for (String city: map.keySet()) {
            System.out.println(map.get(city));
        }

        for (Integer pop: map.values()) {
            System.out.println(pop);
        }

    }

}
