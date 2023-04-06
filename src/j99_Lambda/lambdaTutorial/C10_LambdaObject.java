package j99_Lambda.lambdaTutorial;

import java.util.*;
import java.util.stream.Collectors;

public class C10_LambdaObject {
    public static void main(String[] args) {
        University u01 = new University("Bogazici", "Matematik", 571, 73);
        University u02 = new University("Istanbul", "Matematik", 622, 77);
        University u03 = new University("Marmara", "Hukuk", 1453, 52);
        University u04 = new University("Itu", "uçak muh.", 333, 63);
        University u05 = new University("Yıldız Teknik", "Gemi ", 216, 55);


        List<University> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

        System.out.println("   task01   ");
        System.out.println(controlNotOrt74Byk(unv));


        System.out.println("   task02   ");
        System.out.println(control110azOlmayanOgrncSayısı(unv));

        System.out.println("   task03   ");
        System.out.println(controlMatBolum(unv));

        System.out.println("   task04   ");
        System.out.println(printOgrcSayıBykKcuğe(unv));

        System.out.println("   task05   ");
        System.out.println(printNotOrtTersSıra(unv));

        System.out.println("   task06   ");
        printOgrcSayıEnAzİkinci( unv);

        System.out.println("   task07   ");
        System.out.println(printNotOrt63BykOgrncSayıTop(unv));

        System.out.println("   task08   ");
        System.out.println(printOgrnc333BykNotOrt(unv));

        System.out.println("   task09   ");
        System.out.println(printMatSayısı(unv));

        System.out.println("   task010   ");
        System.out.println(printOgrnSayı571denFazlaMaxNotOrt(unv));

        System.out.println("   task011   ");

        System.out.println(printOgrnSayı1071denAzMinNotOrt(unv));
    }//main


// Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz..

    public static String controlNotOrt74Byk(List<University> unv) {

        return unv.stream().allMatch(t -> t.getNotOrt() > 74) ? "not ortalaması 74 ten buyuk" : "not ortalaması 74 ten buyuk değil";
    }


//task02->ogrc sayilarinin   110 den az olmadigini  kontrol eden code create ediniz.

    public static String control110azOlmayanOgrncSayısı(List<University> unv) {

        return unv.stream().allMatch(t -> t.getOgrncSayısı() > 110) ? "ogrenci sayısı 110 dan fazla" : "ogrenci sayısı 110 dan az";
    }

//task03->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden code create ediniz.

    public static String controlMatBolum(List<University> unv) {
        return unv.stream().anyMatch(t -> t.getBölüm().equals("Matematik")) ? "uni ler en az bir bülüm mat bulundurur" : "uni ler en az bir bülüm mat bulundurmaz";
    }


//task04->universite'leri ogr sayilarina gore b->k siralayiniz.


    public static List<University> printOgrcSayıBykKcuğe(List<University> unv) {

        return unv.stream().sorted(Comparator.comparing(University::getOgrncSayısı).reversed()).collect(Collectors.toList());

    }

    //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...

    public static List<University> printNotOrtTersSıra(List<University> unv) {
      return   unv
                .stream()
                .sorted(Comparator.comparing(University::getNotOrt).reversed())
                .limit(3)
                .collect(Collectors.toList()); // akıştaki elemanları liste atandı.

    }

    //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...

    public static void printOgrcSayıEnAzİkinci(List<University> unv){
        System.out.println(unv
                .stream()
                .sorted(Comparator.comparing(University::getOgrncSayısı))
                .skip(1)
                .collect(Collectors.toList()));


    }

    //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...

    public static int printNotOrt63BykOgrncSayıTop(List<University> unv){

      return   unv.stream()
                .filter(t->t.getNotOrt()>63)
                .mapToInt(t->t.getOgrncSayısı())//akıştaki elemanların data type i parametredeki (int) type göre return eder.
                .sum(); //  akıştaki int elemanların toplamı alındı.

    }


    //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...

    public static OptionalDouble printOgrnc333BykNotOrt(List<University> unv) {
        return
                unv
                        .stream()
                        .filter(t->t.getOgrncSayısı()>333)
                        .mapToDouble(t->t.getNotOrt())
                        .average();
    }

    //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...

    public static int printMatSayısı(List<University> unv){
      return  (int)
        unv.stream()
                .filter(t->t.getBölüm().contains("Mat"))
                .count();   //say
    }

    //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...
public static OptionalDouble printOgrnSayı571denFazlaMaxNotOrt(List<University> unv) {
        return
        unv
                .stream()
                .filter(t->t.getOgrncSayısı()>571)
                .mapToDouble(t-> t.getNotOrt())
                .max(); //akıştaki elemanların max ini alır.

}




    //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...
    public static OptionalDouble printOgrnSayı1071denAzMinNotOrt(List<University> unv) {
        return
                unv
                        .stream()
                        .filter(t->t.getOgrncSayısı()<1071)
                        .mapToDouble(t-> t.getNotOrt())
                        .min(); //akıştaki elemanların max ini alır.

    }

}
