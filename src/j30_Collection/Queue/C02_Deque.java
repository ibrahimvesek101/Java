package j30_Collection.Queue;

import java.util.*;

public class C02_Deque {
    /*
     Deque: Double Ended Queue -> Queue'larda FİFO Deque'lerde hem FİFO hem LİFO geçerli
    LİFO : Last in First out

      */
    public static void main(String[] args) {

        Deque<String> dq1 = new LinkedList<>(Arrays.asList("ankara", "balıkesir", "istanbul", "antep"));

        //  deque print
        System.out.println("dq1 = " + dq1);

        dq1.add("selam");
        System.out.println("dq1 add selam sonrası = " + dq1);

        System.out.println("dq1.getFirst() = " + dq1.getFirst());
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.getLast() = " + dq1.getLast());
        System.out.println("dq1 = " + dq1);


        System.out.println("dq1.peek() = " + dq1.peekFirst());
        System.out.println("dq1.peekLast() = " + dq1.peekLast());

        dq1.clear();

        System.out.println("dq1.peek() = " + dq1.peekFirst());
        System.out.println("dq1.peekLast() = " + dq1.peekLast());
        //    System.out.println("dq1.getFirst() = " + dq1.getFirst());
        //    System.out.println("dq1.getLast() = " + dq1.getLast());

        Deque<String> dq2 = new ArrayDeque<String>(Arrays.asList("domates", "biber", "patlıcan"));
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());//domates
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());//biber
        System.out.println("dq2.pollLast() = " + dq2.pollLast());
     //   System.out.println("dq2.removeFirst() = " + dq2.removeFirst());
      //  System.out.println("dq2.removeLast() = " + dq2.removeLast());

        dq2.clear();
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());
    //    System.out.println("dq2.removeFirst() = " + dq2.removeFirst());
    //    System.out.println("dq2.removeLast() = " + dq2.removeLast());


        System.out.println("\ncode sona kadar çalıştı.");


    }
}
