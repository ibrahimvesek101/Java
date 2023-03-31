package j31_Map;
import java.util.HashMap;
public class C09_replace {
    public static void main(String[] args) {

        //  map.replace(); --> volue yi update eder

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        System.out.println("hm = " + hm);
        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");


        System.out.println("hm.replace(\"Amazon\", \"10 euro\") = " + hm.replace("Amazon", "10 euro"));

        System.out.println("replace sonrası hm = " + hm);

        System.out.println("hm.replace(\"A\", \"10 euro\") = " + hm.replace("A", "10 euro"));


    }
}