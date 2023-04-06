package j30_Collection.Queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class C01_Queue {
    public static void main(String[] args) {

        /*
Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
ile obj uretilir.
Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
Cons seçimine göre queue obj özelliklieri belirlenir.
FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenişr en baştan silinir

 */

        Queue<String> q1 = new LinkedList<>(Arrays.asList("ankara", "balıkesir", "istanbul", "antep"));

        System.out.println("q1  ilk= " + q1);

        q1.add("manisa");
        System.out.println("q1  ilk= " + q1);

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("izmir", "muğla", "antalya"));

        System.out.println("q2  ilk= " + q2);
        q2.add("bodrum");
        System.out.println("q2 +bodrum " + q2);

        System.out.println("q1.element() = " + q1.element());   //
        System.out.println("q1.peek() = " + q1.peek()); //
/*
   peek()-> copy-paste gibi ilk elemanı return eder ama silmez :gözetleme
   poll()-> cut-paste gibi ilk elemanı siler ve  return eder : kesme
   element() -> ilk elemanı silmeden return eder.
   remove() -> ilk elemnı siler ve return eder.. :kaldırma

  ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
  poll ise null return eder.
 */
        q1.clear();
        System.out.println("q1.size() = " + q1.size());
        System.out.println("q1.isEmpty() = " + q1.isEmpty());
        System.out.println("q1.poll() = " + q1.poll());
       // System.out.println("q1.remove() = " + q1.remove());
        System.out.println("q1.peek() = " + q1.peek());
       // System.out.println("q1.element() = " + q1.element());


        // offer() --> eleman eklemek. eleman kısıtlaması varsa(kuyruktaki eleman sayısı belli ise)
        // add() RTE fırlatır.offer() null return eder.

        q1.offer("java");
        System.out.println("q1 = " + q1);

        System.out.println("\ncode sona kadar çalıştı.");
    }
}
