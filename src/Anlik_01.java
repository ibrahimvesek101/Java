import java.util.HashMap;
import java.util.Scanner;


public class Anlik_01 {

    public static void main(String[] args) {
 /*
Task ->
 Key:isim ,email, adres, telefon
 Key'lere ait value'leri depolayan bir kartvizit  map
 ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
 print eden code create ediniz.
 */

        HashMap<String, String> kartvizitIbrahim = new HashMap<>();

        kartvizitIbrahim.put("adı", "ibrahim");
        kartvizitIbrahim.put("email", "ibrahim@gmail.com");
        kartvizitIbrahim.put("adres", "balıkesir");
        kartvizitIbrahim.put("telefon", "123");


        HashMap<String, String> kartvizitNeda=new HashMap<>();


        kartvizitNeda.put("adı", "Neda");
        kartvizitNeda.put("email", "Neda@gmail.com");
        kartvizitNeda.put("adres", "karesi");
        kartvizitNeda.put("telefon", "321");


        HashMap<String, HashMap>kartvizit=new HashMap<>();

        kartvizit.put("ibrahim", kartvizitIbrahim);
        kartvizit.put("Neda", kartvizitNeda);

        System.out.println("kartvizit = " + kartvizit);

    }
}