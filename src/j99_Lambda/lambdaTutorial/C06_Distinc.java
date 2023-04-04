package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_Distinc {

    //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.


    public static void main(String[] args) {

        List<String> yemekList = new ArrayList<>(Arrays.asList("baklava", "güllaç", "sütlaç", "künefeix", "güllaç", "baklava"));


        System.out.println("   task01   ");
        printAlfbtkBykHrfBenzersiz(yemekList);

        System.out.println("\n   task02   ");
        printKrktrsayisiTekrarsızTersSıra(yemekList);


        System.out.println("\n   task03   ");
        elemanKrktrSayıSırala(yemekList);

        System.out.println("\n   task04   ");
        printSonKrktrTersSıralı(yemekList);

        System.out.println("\n   task05   ");
        ciftSayiliKrktrKareleriTekrarsız(yemekList);

    }//main

//Task01-> list elemanlarını alfabetik Buyuk harf ile tekrarsız print eden code create ediniz...

    public static void printAlfbtkBykHrfBenzersiz(List<String> yemekList) {

        yemekList
                .stream()
                .map(String::toUpperCase)
                .sorted()
                .distinct()
                .forEach(C01_LambdaExpression::yazdirStr);
    }

    // Task02-> : list elemanlarinin character sayisini
    // ters sirali olarak tekrarsiz print eden code create ediniz.

    public static void printKrktrsayisiTekrarsızTersSıra(List<String> yemekList) {

        yemekList
                .stream()
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(C01_LambdaExpression::yazdirInt);
    }
// Task03-> : list elemanlarinin character sayisini k->b sıralı print eden code create ediniz.


    public static void elemanKrktrSayıSırala(List<String> yemekList) {

        yemekList.stream()
                .map(String::length)
                .sorted()
                .forEach(C01_LambdaExpression::yazdirInt);

    }
// Task04-> : list elemanlarini son characterine göre
// ters sıralı print eden code create ediniz.

    public static void printSonKrktrTersSıralı(List<String> yemekList) {
        yemekList
                .stream()
                .sorted(Comparator.comparing(t -> t
                                .toString()
                                .charAt(t.toString().length() - 1))
                        .reversed())
                .forEach(C01_LambdaExpression::yazdirStr);
    }
    // Task05-> listin elemanlarin  cift sayili karakterlerinin  karelerini
    // tekrarsiz buyukten kucuge sirali  print eden code create ediniz...


    public static void ciftSayiliKrktrKareleriTekrarsız(List<String> yemekList) {

        yemekList.stream()
                .map(t->t.length()*t.length())
                .filter(C01_LambdaExpression::ciftMi)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(C01_LambdaExpression::yazdirInt);
    }
}