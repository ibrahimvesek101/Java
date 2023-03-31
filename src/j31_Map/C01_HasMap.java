package j31_Map;

import java.util.HashMap;

public class C01_HasMap {
    public static void main(String[] args) {

        /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
            dublicate kabul etnez
            Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */

        HashMap<String, String>hm=new HashMap<>();

        // map.put--> girilen key, value değeri map e eleman olarak ekler.

        hm.put("amazon","290 $");
        hm.put("null","121 $");     // null olabilir
        hm.put("Teknosa","290 $");  // value iki aynı değer alabilir. amazon da 290.
        hm.put("Vatan","140 $");
        hm.put("Vatan","312 $");    //iki adet aynı key varsa enson alınır. eskisi ezilir.

       // map print sout içine map parametre alır.

        System.out.println("hm = " + hm);       //hm = {amazon=290 $, null=121 $, Teknosa=290 $, Vatan=312 $}

    }
}
