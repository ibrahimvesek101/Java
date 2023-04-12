package j99_Lambda.lambdaTutorial.Tasks_EllyHoca.src;

import java.util.*;
import java.util.stream.Collectors;

public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        System.out.println("*** S1 ***");
        yazdir(list);

        System.out.println("\n*** S2 ***");
        negatifYazdir(list);

        System.out.println("\n*** S3 ***");
        pozitifYazdir(list);

        System.out.println("\n*** S4 ***");
        System.out.println("(kareList(list)) = " + (kareList(list)));

        System.out.println("\n*** S5 ***");
        System.out.println("(kareListTekrarsız(list)) = " + (kareListTekrarsız(list)));

        System.out.println("\n*** S6 ***");
        System.out.println("sıralaK_B(list) = " + sıralaK_B(list));

        System.out.println("\n*** S7 ***");
        sıralaB_K(list);

        System.out.println("\n*** S8 ***");
        System.out.println("son5Basamak(list) = " + son5Basamak(list));

        System.out.println("\n*** S9 ***");
        System.out.println("son5BasDegil(list) = " + son5BasDegil(list));

        System.out.println("\n*** S10 ***");
        System.out.println("elemanlarToplamı(list) = " + elemanlarToplamı(list));

        System.out.println("\n*** S11 ***");
        System.out.println("negatifKareList(list) = " + negatifKareList(list));

        System.out.println("\n*** S12 ***");
        bestenBuyuk(list);

        System.out.println("\n*** S13 ***");
        sıfırdanKücükMü(list);

        System.out.println("\n*** S14 ***");
        yuzeEsitElemanYokMu(list);

        System.out.println("\n*** S15 ***");
        sıfıraEsitElemanYokMu(list);


        System.out.println("\n*** S16 ***");
        ilk5ElemanıTopla(list);

        System.out.println("\n*** S17 ***");
son5ElemanıListele(list);

    }   //main

    private static void son5ElemanıListele(List<Integer> list) {
        System.out.println(list.stream().skip(list.size()-5).collect(Collectors.toList()));
    }


    // S17: listenin son bes elemaninin  listele -skip long


    // S16:  listenin ilk 5 elemanini topla? - limit(5)
    private static void ilk5ElemanıTopla(List<Integer> list) {
        System.out.println(list.stream().limit(5).reduce(0, (x, y) -> x + y));
    }

    // S15: listenin sifira esit elemani yok mu? - noneMatch
    private static void sıfıraEsitElemanYokMu(List<Integer> list) {
        System.out.println("listenin 0 a esit elemani yok mu ?");
        System.out.println(list.stream().noneMatch(t -> t == 0));
    }


    // S14: listenin 100 e esit elemani yok mu ? -noneMatch
    private static void yuzeEsitElemanYokMu(List<Integer> list) {
        System.out.println("listenin 100 e esit elemani yok mu ?");
        System.out.println(list.stream().noneMatch(t -> t == 100));
    }

    // S13 : listenin tum elemanlari sifirdan kucuk mu? -allMatch
    private static void sıfırdanKücükMü(List<Integer> list) {
        System.out.println("listenin tüm elemanları 0 dan küçük mü");
        System.out.println(list.stream().allMatch(t -> t < 0));
    }

    // S12 : listeden 5 den buyuk  sayi var mi? -anyMatch
    private static void bestenBuyuk(List<Integer> list) {
        System.out.println("5 ten buyuk eleman var mı?");
        System.out.println(list.stream().anyMatch(t -> t > 5));
    }

    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim

    /*
    peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
   ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
   yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir

    */

    private static List<Integer> negatifKareList(List<Integer> list) {
        return list.stream().filter(t -> t < 0).peek(x -> System.out.print("negatif sayı : " + x))
                .map(t -> t * t).peek(x -> System.out.println(", karesi : " + x)).collect(Collectors.toList());
    }

    // S10 :list elemanlarini toplamini bulalim
    private static Integer elemanlarToplamı(List<Integer> list) {
        return list.stream().reduce(0, (x, y) -> x + y);
    }


    // S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
    private static List<Integer> son5BasDegil(List<Integer> list) {

        return list.stream().filter(t -> t > 0).map(t -> t * t).filter(t -> t % 10 != 5).collect(Collectors.toList());
    }


    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    private static List<Integer> son5Basamak(List<Integer> list) {
        return list.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).collect(Collectors.toList());
    }


    // S7: listin elemanlarini buyukten kucuge siralayalim
    private static void sıralaB_K(List<Integer> list) {
        //  return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }


    // S6: listin elemanlarini kucukten buyuge siralayalim
    private static List<Integer> sıralaK_B(List<Integer> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }


    // S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
    private static List<Integer> kareListTekrarsız(List<Integer> list) {
        return list.stream().map(t -> t * t).distinct().collect(Collectors.toList());
    }

    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    private static List<Integer> kareList(List<Integer> list) {
        return list.stream().map(t -> t * t).collect(Collectors.toList());
    }

    // S3: pozitif olanlardan yeni bir liste olustur
    private static void pozitifYazdir(List<Integer> list) {
        System.out.println(list.stream().filter(t -> t > 0).collect(Collectors.toList()));
    }

    // S2: sadece negatif olanlari yazdir
    private static void negatifYazdir(List<Integer> list) {
        list.stream().filter(t -> t < 0).forEach(t -> System.out.print(t + " "));
    }

    // S1:listi aralarinda bosluk birakarak yazdiriniz
    private static void yazdir(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

}