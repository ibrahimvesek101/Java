package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {
    public static void main(String[] args) {
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder

    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.

    //noneMatch()--> hic bir eleman sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
        List<String> yemekList = new ArrayList<>(Arrays.asList("baklava", "güllaç", "Sütlaç", "künefe", "güllaç", "baklava"));


        System.out.println("   task01   ");
        kontrolCharSayısı7ve7denAz(yemekList);


        System.out.println("\n   task02   ");
        System.out.println(kontrolCharWBasla(yemekList));


        System.out.println("\n   task03   ");
        System.out.println(kontrolCharXileBiten(yemekList));


    }//main

    // task 01-> List elemanlarının karakter sayısını 7 ve y den az olma durumunu kontrol eden code create ediniz.

    public static void kontrolCharSayısı7ve7denAz(List<String> yemekList) {
        if (yemekList.stream().anyMatch(t -> t.length() <= 7)) {
            System.out.println("menüde 7 harf ve daha az karakter vardır.");
        } else {
            System.out.println("menüde aranan yemek yok");
        }
    }



    // Task02-> List elemanlarinin "W" ile baslamamasını kontrol eden code create ediniz...->noneMatch
    public static String kontrolCharWBasla(List<String> yemekList) {

        return    (yemekList.stream().noneMatch(t -> t.toUpperCase().startsWith("W")))?"menüde W harfi ile başlayan yok":"menüde W ile başlayan vardır.";

    }



    // Task03-> List elelmanlarinin "x" ile biten en az bir elemanın varlığını kontrol ediniz eden code create ediniz...->

    public static String kontrolCharXileBiten(List<String> yemekList) {

        return    (yemekList.stream().noneMatch(t -> t.toUpperCase().endsWith("X")))?"menüde x ile biten yok":"menüde x ile biten var";

    }
}

