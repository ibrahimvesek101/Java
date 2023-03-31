package j30_Collection.Set;

import java.util.Arrays;
import java.util.HashSet;

public class C01_Set {
    public static void main(String[] args) {
   /*
     Set :  1) unique(benzersiz tek) elemanlardan olusur, Set'lerin icinde bir eleman sadece bir kere kullanilabilir. mükerrer(duplicate) eleman olmaz.
            2) sadece bir null değeri alabilir.(treeSet hariç).Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.
                 Java her data icin hashing teknigini kullanarak bir code uretir.Bu code'u almak icin HashCode() methodu kullanilir.
                 Hashing, farklı büyüklükteki girdilerden sabit büyüklükte bir çıktı oluşturma sürecine verilen isimdir.
                 Universitelerdeki ogrenci numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum datalara ulasilabilir.


            Set     --> HashSet         : 1) HashSet, duplication’a(tekrarlı eleman) izin vermez.
                                            Eger bir elemani tekrar HashSet’e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
                                          2) Haset'ler Set'ler arasinda en hizli olanıdir. bir algoritmaya göre kayit eder.
                                           değerlerin giriş sırasına dikkat edilmez. (LinkedHashSet hariç)
                                          3) HashSet "null" object'ini eleman olarak kullanabilir.
                                          Ancak birden fazla null degerini bir HashSet’e eklemek isterseniz sadece bir tane null degeri olur.

                        LinkedHashset   : 1) Tekrarli eleman kabul etmezler. Elemanlari ekleme sirasina(insertion order) gore dizerler.
                                          2) LinkedHashSet, HashSet'den daha yavas calisir.
                                          3) LinkedHashSet "null" object'ini eleman olarak kullanabilir.
                                          4) Ekleme ve remove islemlerinde hizlidirlar.

                        TreeSet         : 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
		                                  2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge) gore dizer.
		 	                              3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmalı...
		 	                              4)AHAN DA TRİCK :TreeSet "null" object'ini eleman olarak kullanilamaz.


         Set Methods :
            .add(eleman);-->Set’e eleman ekler
            .addAll(collection);-->istenen collection’in tum elemanlarini ekler
            .contains(eleman);-->istenen eleman set’te varsa true, yoksa false return eder.
            .containsAll(collection);-->istenen collection’in tumu aranan sette var ise true, yoksa false return eder.
            .remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false return eder.
            .removeAll(collection);-->istenen collection’in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false return eder.
            .equlas(set2);-->istenen set2’le tum elemanlar ayni ise true, yoksa false return eder.
            .retainAll(collection1);-->collection1’nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false return eder.
              (kesişen ortak elemanları döndürür.)
            .clear();-->sett'teki Tum elemanlari siler
            .isEmpty();-->Sette hic eleman yoksa true, varsa false return eder
            .size();-->set’in eleman sayisini verir

     */


        HashSet<String> hs1 = new HashSet<>();//bos hashSet
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("javaCAN", "javaSU", "javaNAZ", "javIYE", "javIDAN", "javaTAR", "javFER"));//
        //set print etme->
        System.out.println("hs2 = " + hs2);//[javaNAZ, javaTAR, javaCAN, javIYE, javaSU, javFER, javIDAN]
        // set add()-> eleman ekleme
        hs2.add("javvaNUR");
        System.out.println("hs2 add javaNUR sonrası : " + hs2);// [javvaNUR, javaNAZ, javaTAR, javaCAN, javIYE, javaSU, javFER, javIDAN]
        // set'e tekrarlı eleman ekleme ->
        hs2.add("javaSU");
        System.out.println("hs2 tekrarlı eleman ekleme sonrası : " + hs2);//  [javvaNUR, javaNAZ, javaTAR, javaCAN, javIYE, javaSU, javFER, javIDAN]
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        System.out.println("hs2 null ekleme sonrası : " + hs2);// [null, javvaNUR, javaNAZ, javaTAR, javaCAN, javIYE, javaSU, javFER, javIDAN]

        HashSet<String> hs3 = new HashSet<>(Arrays.asList("güllaç", "kazanDibi", "profetorol", "sumuhallebisi", "sütlaç", "hoşaf", "reyhan şerbeti"));//
        System.out.println("hs3 = " + hs3);//[profetorol, kazanDibi, sütlaç, sumuhallebisi, hoşaf, reyhan şerbeti, güllaç]
        hs2.addAll(hs3);
        System.out.println("hs2 = " + hs2);//[null, javvaNUR, profetorol, javaNAZ, kazanDibi, javaTAR, javaCAN, javaSU, hoşaf, güllaç, sütlaç, javIYE, sumuhallebisi, javFER, javIDAN, reyhan şerbeti]
        //set remove() -> eleman silme
        System.out.println("hs2.remove(null) = " + hs2.remove(null));// true

        System.out.println("hs2.removeAll(hs3) = " + hs2.removeAll(hs3));// true
        System.out.println("hs2 remove hs3 sonrası : " + hs2);// [javvaNUR, javaNAZ, javaTAR, javaCAN, javaSU, javIYE, javFER, javIDAN]
        System.out.println("hs2.size() = " + hs2.size()); // 8

        System.out.println("hs2.isEmpty() = " + hs2.isEmpty()); // false

        hs2.clear();
        System.out.println("hs2 clear sonrası : " + hs2);// []
        System.out.println("hs2.size() clear sonrası : " + hs2.size()); // 0
        System.out.println("hs2.isEmpty() clear sonrası :  " + hs2.isEmpty()); // true

        // set contains()-> eleman varlığı kontrol
        System.out.println("hs3.contains(\"kazanDibi\") = " + hs3.contains("kazanDibi"));//true
        System.out.println("hs3.contains(\"künefe\") = " + hs3.contains("künefe")); //false

        System.out.println("hs2.hashCode() = " + hs2.hashCode());// 0
        System.out.println("hs3.hashCode() = " + hs3.hashCode());// 701589046
    }
}