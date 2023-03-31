package j31_Map;
import java.util.HashMap;
public class C06_putAll {
    public static void main(String[] args) {

        //map.putAll(); --> girilen map istenen map e eklenir.

        HashMap<String, String> hm1 = new HashMap<>();//bos hm tanımlandı

        hm1.put("Amazon", "296 Euro");
        hm1.put("Saturn", "200 Euro");
        hm1.put("Vatan", "111 Euro");
        hm1.put("Apple", "450 Euro");
        hm1.put("Teknosa", "333 Euro");
        hm1.put("Media Markt", "444 Euro");

        HashMap<String, String> hm2 = new HashMap<>();//bos hm tanımlandı

        hm2.put("istanbul", "34");
        hm2.put("ankara", "06");
        hm2.put("balıkesir", "10");
        hm2.put("bursa", "16");
        hm2.put("izmir", "35");
        hm2.put("aydın", "09");

        System.out.println("hm2 = " + hm2);

        hm1.putAll(hm2);
        System.out.println("hm1 = " + hm1);
        System.out.println("hm2 = " + hm2);

        HashMap<String,String>hm3=hm1; // hm1 hm3 e atandı.

        HashMap<String,String>hm4=new HashMap<>(hm3);   // hm3 hm4 e atandı

        System.out.println("hm3 = " + hm3);
        System.out.println("hm4 = " + hm4);


    }
}