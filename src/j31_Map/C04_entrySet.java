package j31_Map;

import java.util.HashMap;

public class C04_entrySet {

    public static void main(String[] args) {

        // map.entrySet()->> girilen map in key-value tüm datalarını Sete atayıp return eder.


        HashMap<String, String> hm=new HashMap<>();

        hm.put("amazon","290 $");
        hm.put("null","121 $");
        hm.put("Teknosa","290 $");
        hm.put("Vatan","140 $");
        hm.put("Vatan","312 $");

        System.out.println("hm = " + hm);   //{amazon=290 $, null=121 $, Teknosa=290 $, Vatan=312 $}
        System.out.println("hm.entrySet() = " + hm.entrySet()); //  [amazon=290 $, null=121 $, Teknosa=290 $, Vatan=312 $]
    }
}
