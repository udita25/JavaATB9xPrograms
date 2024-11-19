package Nov.ex19112024;

import java.util.ArrayList;

public class Lab033 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Udita");
        list.add(123);
        list.add(true);
        list.add(12.34);
        list.add('A');

        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains('A'));
        System.out.println(list.contains(12));
        System.out.println(list.indexOf("Udita"));
        System.out.println(list.indexOf(12.34));
    }
}
