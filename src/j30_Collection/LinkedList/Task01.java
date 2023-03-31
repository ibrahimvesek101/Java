package j30_Collection.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task->
Node değerleri "Murat","javaCAN","javaTAR","Abdi bey" olan bir linkedList create ediniz.
Girilen bir String değeri linkedListte varlığını kontrol edip varsa slilp "Agam eleman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */

        LinkedList<String> list = new LinkedList<>(Arrays.asList("ibrahim", "javaCAN", "javaTAR", "Balıkesir"));

        Scanner input = new Scanner(System.in);
        String kelime = input.nextLine();

        if (list.contains(kelime)) {
            list.remove(kelime);

            System.out.println("eleman halledildi");
        } else {

            System.out.println("elemana ulaşılamadı");
        }


    }
}
