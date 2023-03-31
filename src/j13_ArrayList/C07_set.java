package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_set {
    public static void main(String[] args) {
        //set()-> listin istenen index'e istenen elemanını  update set eder-> şu indexin şu elelmanını şununla değiştir

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval

        System.out.println("set öncesi ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]

        System.out.println("ulkelist.set(3,\"Patagonya\") = " + ulkelist.set(3, "Patagonya"));//3. index eski eleman return eder

        System.out.println("set sonrası ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]

        // System.out.println("ulkelist.set(3,\"Patagonya\") = " + ulkelist.set(33, "PataGONYA"));//olmayan index RTE
        // ulkelist.set(3, "a", 5, "b");//CTE set method çoklu parametre çalışmaz
    }
}