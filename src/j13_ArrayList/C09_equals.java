package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_equals {
    public static void main(String[] args) {
        //equals()-> iki listin hem index hem de value (değer) eşitliğini kontrol eder true/false return eder

        ArrayList<String> ulkelist1 = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        ArrayList<String> ulkelist2 = new ArrayList<>(Arrays.asList("Almanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist1.equals(ulkelist2) = " + ulkelist1.equals(ulkelist2));//false
        ArrayList<String> ulkelist3 = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist3.equals(ulkelist1) = " + ulkelist3.equals(ulkelist1));//true

    }
}