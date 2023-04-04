package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sorted {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));

        System.out.println("   task01   ");
        ciftKareleriSırala( sayiList);

        System.out.println("\n   task02   ");
        tekKareleriTersSırala( sayiList);

        System.out.println("\n   task03   ");


        System.out.println("\n   task04   ");


        System.out.println("\n   task05   ");
    }//main

    // Task01-> listin çift elemanlarının karelerini k->b sıra ile
    // print eden code create ediniz


    public static void ciftKareleriSırala(List<Integer> sayiList){

        sayiList.stream()
                .filter(C01_LambdaExpression::ciftMi)
                .map(t->t*t)
                .sorted().forEach(C01_LambdaExpression::yazdirInt);
    }

    /*
    sorted-> akıştaki elemanları naturel order(doğal sıralama ile) halinde akış return eder.

    sorted-> tekrarlı kullanılırsa son return aktif olur.

     */

// Task02-> list tek elemanlarının karelerini
// b->k sıra ile print eden code create ediniz


    public static void tekKareleriTersSırala(List<Integer> sayiList){

        sayiList.stream()
                .filter(t->t%2==1)
                .map(t ->t*t)
                .sorted(Comparator.reverseOrder())  //ters sırala..
                .forEach(C01_LambdaExpression::yazdirInt);
    }

}
