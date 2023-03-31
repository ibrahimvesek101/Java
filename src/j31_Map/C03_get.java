package j31_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {

        //map.get(key); ->girilen key e ait value return eder.

        HashMap<String, String> hm=new HashMap<>();

        hm.put("amazon","290 $");
        hm.put("null","121 $");
        hm.put("Teknosa","290 $");
        hm.put("Vatan","140 $");
        hm.put("Vatan","312 $");

        System.out.println("hm = " + hm);

        System.out.println("amazon value = " + hm.get("amazon"));   // 290 $
        System.out.println("olmayan eleman = " + hm.get("olmayan"));    //null
        System.out.println("hm.get(33) = " + hm.get(33));   //null



    }
}
