package j31_Map;

import java.util.HashMap;

public class C02_KeySetValues {
    public static void main(String[] args) {

        //  map.keySet()-> map key değerlerini Set e (collections) atayıp return eder

        HashMap<String, String> hm=new HashMap<>();

        hm.put("amazon","290 $");
        hm.put("null","121 $");
        hm.put("Teknosa","290 $");
        hm.put("Vatan","140 $");
        hm.put("Vatan","312 $");


        System.out.println("hm = " + hm);
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        System.out.println("*** task ***");


        //Task-> hm key ve value larını aynı satırda (satır-satır)
        // print eden code create ediniz. (for-each ile çözelim.)

        for (String w:hm.keySet()) {
            System.out.print(w+" ");
        }
        System.out.println();
        for (String a:hm.values()) {
            System.out.print(a+" ");
        }
    }
}
