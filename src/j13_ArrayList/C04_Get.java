package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_Get {
    public static void main(String[] args) {
        //get()-> listte girilen index'deki elemanı return eder. olmayan index için RTE exc. fırlatır
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval

        System.out.println("ulkelist.get(3) = " + ulkelist.get(3));//Dingiltere
        // System.out.println("ulkelist.get(33) = " + ulkelist.get(33));//RTE IndexOutOfBoundsException. fırlatır


    }
}