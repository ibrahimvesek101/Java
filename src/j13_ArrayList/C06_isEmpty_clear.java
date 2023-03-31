package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_isEmpty_clear {
    public static void main(String[] args) {
        //isEmpty()-> listin boş olmasını kontrol eder true/false return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.isEmpty() = " + ulkelist.isEmpty());//false
        System.out.println("ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        //clear()-> listin tum elemanlarını silip boşaltır
        ulkelist.clear();
        System.out.println("clear sonrası ulkelist = " + ulkelist);//[]
        System.out.println("clear sonrası ulkelist.size() = " + ulkelist.size());//0
        System.out.println("clear sonrası ulkelist.isEmpty() = " + ulkelist.isEmpty());//true
    }
}
