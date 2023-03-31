package j31_Map.Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
Task ->
 Key:isim ,email, adres, telefon
 Key'lere ait value'leri depolayan bir kartvizit  map
 ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
 print eden code create ediniz.
 */

        HashMap<String, String> kartvizitIbrahim = new HashMap<>();

        kartvizitIbrahim.put("isim", "Ibrahim Vesek");
        kartvizitIbrahim.put("email", "ibrahim@gmail.com");
        kartvizitIbrahim.put("adres", "Balıkesir");
        kartvizitIbrahim.put("telefon", "1234567");

        HashMap<String, String> kartvizitNeda = new HashMap<>();

        kartvizitNeda.put("isim", "Neda Vesek");
        kartvizitNeda.put("email", "neda@gmail.com");
        kartvizitNeda.put("adres", "Karesi");
        kartvizitNeda.put("telefon", "123");

        Map<String, HashMap<String, String>> kartvizit = new HashMap<>();

        kartvizit.put("vesekİbrahim", kartvizitIbrahim); // map leri value atayan String key ile çalışan map.
        kartvizit.put("vesekNeda", kartvizitNeda);

        System.out.println("kartvizit = " + kartvizit);//{vesekİbrahim={telefon=1234567, adres=Balıkesir, email=ibrahim@gmail.com, isim=Ibrahim Vesek}
        //vesekNeda={telefon=123, adres=Karesi, email=neda@gmail.com, isim=Neda Vesek}}



            //OBJE İLE ÇÖZÜM :(Task02_Kartvizit class create ettik bu aşamadan sonra)



        Map<Integer, Task02_Kartvizit> krtvzt = new HashMap<>();// krtvzt obj
        Task02_Kartvizit k1 = new Task02_Kartvizit("ibrahim", "ibrahimvesek@gmail", "dut ağacı altı", "12345", 12321);
        krtvzt.put(k1.id, k1);
        System.out.println("kartvizit = " + krtvzt);


        Task02_Kartvizit k2 = new Task02_Kartvizit("NedaVesek", "nedavesek@gmail", "dutluk ağacı altı", "123", 12);
        krtvzt.put(k1.id, k1);
        System.out.println("krtvzt = " + krtvzt);

        krtvzt.put(k2.id, k2);

        System.out.println("krtvzt = " + krtvzt);
    }
}
