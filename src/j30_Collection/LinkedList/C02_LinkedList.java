package j30_Collection.LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1905);
        ll.add("domates");
        ll.add("$");

        System.out.println("ll = " + ll);

        //  yavaş çalışır tavsiye edilmez obj den dolayı

    }
}
