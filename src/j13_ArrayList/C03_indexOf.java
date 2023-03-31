package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf()-> list içinde istenen eleman var ise index'ini return eder olmayan elelman için -1 return eder

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.indexOf(\"Amerigonya\") = " + ulkelist.indexOf("Amerigonya"));// 4
        System.out.println("ulkelist.indexOf(\"amerigonya\") = " + ulkelist.indexOf("amerigonya"));// -1 case sensitive
        System.out.println("ulkelist.indexOf(\"patogonya\") = " + ulkelist.indexOf("patogonya"));// -1 olmayan elelman
        ulkelist.add("Polkonya");
        System.out.println("ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya, Polkonya]
        System.out.println("ulkelist.indexOf(\"Polkonya\") = " + ulkelist.indexOf("Polkonya"));//2 ->
        // tekrarlı eleman indexi sorgulandığında soldan sağa ilk bulduğu elemanın indexini rerturn eder
        System.out.println("ulkelist.lastIndexOf(\"Polkonya\") = " + ulkelist.lastIndexOf("Polkonya"));//5 -> sondan polkanyayı bulunca başdan indexini verir
        System.out.println("ulkelist.lastIndexOf(\"Patogonya\") = " + ulkelist.lastIndexOf("Patogonya"));//-1 olmayan eleman

    }
}