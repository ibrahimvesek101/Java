package j19_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder create etme...

        //1. yol
        StringBuilder sb1 = new StringBuilder();//default 16 capacity boş sb
        System.out.println("sb1 = " + sb1);//
        System.out.println("sb1.length() = " + sb1.length());//0
        System.out.println("sb1.capacity() = " + sb1.capacity());// 16

        sb1.append("Murat");//sb1' e Murat value eklendi
        System.out.println("sb1 = " + sb1);//Murat
        System.out.println("sb1.capacity() = " + sb1.capacity());// 16
        System.out.println("sb1.length() = " + sb1.length());// 5

        sb1.append(" Qa tester team lead");

        System.out.println("sb1 = " + sb1);
        System.out.println("sb1. capacity() = " + sb1.capacity());// 34

        sb1.append(" çoooğğğ  zengin olasan").append(1453).append(true);
        System.out.println("sb1 = " + sb1);// Murat Qa tester team lead çoooğğğ  zengin olasan1453true

        System.out.println("sb1.capacity() = " + sb1.capacity());// 70->capacity aşımında yeniCapacity=eskiCapacity*2+2 olarak atanır

        // 2. yol
        StringBuilder sb2 = new StringBuilder("Aydın beye hızlıcana offer");//initial ilk değer atanmış sb2
        System.out.println("sb2 = " + sb2);//Aydın beye hızlıcana offer
        System.out.println("sb2.length() = " + sb2.length()); // 26
        System.out.println("sb2.capacity() = " + sb2.capacity());// 42
        /*
         inital edilen sb capacity=16+ ilk değer length  olarak  atanır
         */

        //trimToSize()-> capacity de length fazlası character siler.
        sb2.trimToSize();
        System.out.println("trimToSize sonrası sb2.capacity() = " + sb2.capacity());// 26

        //3. yol
        StringBuilder sb3 = new StringBuilder(17);//initial edilmemiş ama capacity değeri atanmış sb.
        System.out.println("sb3 = " + sb3);//
        System.out.println("sb3.length() = " + sb3.length());// 0
        System.out.println("sb3.capacity() = " + sb3.capacity()); // 17
        sb3.append("Taha Bey'e senior offer çekkk ...");
        System.out.println("sb3 = " + sb3);//Taha Bey'e senior offer çekkk ...
        System.out.println("sb3.capacity() = " + sb3.capacity());// 17*2+2=36

        // Sb'deki istenen index characteri alma..
        System.out.println("sb3.charAt(16) = " + sb3.charAt(16));//r
        //   System.out.println("sb3.charAt(99) = " + sb3.charAt(99));//olmayan index character için RTE-> StringIndexOutOfBoundsException

        //Sb'deki beklirli aralık character  alma...
        System.out.println("sb3.subSequence(7,27) = " + sb3.subSequence(7, 27));//7,8..26. index char->y'e senior offer çek
        System.out.println("sb3.substring(12) = " + sb3.substring(12));//12.13... index char->enior offer çekkk ...
        System.out.println("sb3.substring(7,27) = " + sb3.substring(7, 27));////7,8..26. index char->y'e senior offer çek

        // Sb'deki istenen index characteri silme...
        sb3.deleteCharAt(10);//
        System.out.println("sb3.deleteCharAt(9) = " + sb3.deleteCharAt(9));//

        System.out.println("9. index silindikten sonra sb3 = " + sb3);//

        // Sb'deki istenen aralık  index characterleri silme...

        System.out.println("sb3.delete(3,7) = " + sb3.delete(3, 7));//Tahy'senior offer çekkk ...->silinmiş Sb return eder

        // Sb'e istenen character veya characterleri ekleme ..girdi yapma
        System.out.println("sb3.insert(1,sb2,3,10) = " + sb3.insert(1, sb2, 3, 10));//sb3'ün 1. index'e sb2'nin 3i index dahil, 10. index hariç insert et
        // Tın beyeahy'senior offer çekkk ...
        System.out.println("sb3.insert(5,sb1) = " + sb3.insert(5, sb1));//ab3'un 5. indexinden itibaren sb1 ekle


        //Sb'deki istenen index character update(set) etme...
        System.out.println(" set öncesi sb1 = " + sb1);//Murat Qa tester team lead çoooğğğ  zengin olasan1453true
        sb1.setCharAt(13, '$');//sb1 13. index character $ ile update edildi
        System.out.println(" set sonrası sb1 = " + sb1);//Murat Qa test$r team lead çoooğğğ  zengin olasan1453true

        // Sb'deki istenen index'e birden çok karakter eklemek...
        System.out.println(" replace öncesi sb1 = " + sb1);// Murat Qa test$r team lead çoooğğğ  zengin olasan1453true
        System.out.println("sb1.replace(3,13,\"abukSabuk\") = " + sb1.replace(3, 34, "abukSabuk"));//
        System.out.println(" replace sonrası sb1 = " + sb1);//MurabukSabuk$r team lead çoooğğğ  zengin olasan1453true

        // Sb obj String variable'e convert(çevirme) etme...
        StringBuilder sb7 = new StringBuilder("Ismail javaTAR ");
        System.out.println(" toString öncesi sb7 = " + sb7);//  Ismail javaTAR
        System.out.println("sb7.toString().toUpperCase( ) = " + sb7.toString().toUpperCase());// ISMAİL JAVATAR
        System.out.println("toString sonrası sb7 = " + sb7);//  Ismail javaTAR

        String name = "selam";
        System.out.println("name = " + name);// selam
        StringBuilder sb8 = new StringBuilder(name);//String variable SB a atandı
        System.out.println("sb8 = " + sb8);// selam

        /*
        compareTo()->metodunu iki SB'i eşitliğini kontrol etmek için ilk characterden itibaren tum characterleri karşılaştırır.
        eşit characterler için herhangi bir return vermezken farklı characterler için ascii table göre kaç değer geri veya ileri oldg
        print eder
        Tum characterler eşit ise 0 return eder
        ahan da Trick-> SB ile String variable compare edilirse :CTE -> elam armut kıyası olmaz...

         */

        StringBuilder sb10 = new StringBuilder("başarı gayrete AŞIKTIR :)");
        StringBuilder sb11 = new StringBuilder("başarı gayrete AŞIKTIR :)");
        String str = "başarı gayrete AŞIKTIR :)";

        System.out.println("sb10.compareTo(sb11) = " + sb10.compareTo(sb11));// 0-> sb10 ve sb11 tum characterler eşit
        System.out.println("sb11.compareTo(sb10) = " + sb11.compareTo(sb10));//0-> sb11 ve sb10 tum characterler eşit
        // sb10.compareTo(str);-> CTE  agam nidding elma armut kıyası olmaz
        System.out.println("sb10.compareTo(new StringBuilder(str)) = " + sb10.compareTo(new StringBuilder(str)));// 0->
        System.out.println("sb10.toString().equals(str) = " + sb10.toString().equals(str));//true

        System.out.println(sb10 == sb11);// false  -> sb10 ve sb11 value'ları aynı fakat iki farklı obj old için ref değerleri farklı
        System.out.println(sb10.equals(sb11));// false -> sb10 ve sb11 value'ları aynı fakat iki farklı obj old için ref değerleri farklı
        // trick-> Sb 'da equals() meth aynı == gibi return eder: hem ref. hem de value controlu yapar.

            // SB  character'leri index'e göre ters cevirme
        System.out.println("reverse öncesi sb10 = " + sb10);// başarı gayrete AŞIKTIR :)
        System.out.println("sb10.reverse() = " + sb10.reverse());//  ): RITKIŞA eteryag ıraşab


    }
}
