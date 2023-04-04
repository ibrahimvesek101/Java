package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {

        //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek
        // veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 3, 11, 4, 12, 2, 5, 17));

        System.out.println("\n   task01   ");
        printCiftElemanKareFunctional( sayiList);
        System.out.println("\n   task02   ");
        printTekKupBirFazla( sayiList);
        System.out.println("\nsayiList = " + sayiList);       // list değişmiyor
        System.out.println("\n   task03   ");
        printCiftElemanKarekokler( sayiList);
        System.out.println("\n   task04   ");

    }
    // task01-> listin çift elemanlarının karelerini aynı satıra
    // aralarına bosluk bırakarak print ediniz.

    public static void printCiftElemanKareFunctional(List<Integer> sayiList) {
        sayiList
                .stream()   //7, 3, 11, 4, 12, 2, 5, 17 (elemanlar akışa alındı)
                .filter(C01_LambdaExpression::ciftMi)   //4,12,2    (çiftler filtrelendi)
                .map(t->t*t).forEach(C01_LambdaExpression::yazdirInt);  // 16,144,4  (filtrelenen elemanlar karelerine update edildi. ve print eildi)

    }

    // task02-> listin tek elemanlarının küplerinin 1 fazlası aynı satıra aralarına bosluk bırakarak print ediniz.

    public static void printTekKupBirFazla(List<Integer> sayiList){

        sayiList
                .stream()
                .filter(t->t%2==1)
                .map(t->t*t*t+1)
                .forEach(C01_LambdaExpression::yazdirInt);
    }
// Task03-> Functional Programming ile listin cift elemanlarinin   karekoklerini
// ayni satirda aralarina bosluk birakarak print ediniz.

    public static void printCiftElemanKarekokler(List<Integer> sayiList) {

        sayiList
                .stream()
                .filter(t -> t % 2 == 0)
                .map(t -> (int) Math.sqrt(t))
                .forEach(C01_LambdaExpression::yazdirInt);
    }

}