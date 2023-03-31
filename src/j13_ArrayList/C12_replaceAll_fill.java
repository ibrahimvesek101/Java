package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C12_replaceAll_fill {
    public static void main(String[] args) {
        //replaceall();-> List'te belirli bir elemanı belirli bir elemana update eder.treu/ false return eder

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya", "Güba"));//çuval
        System.out.println("replaceAll öncesi ulkelist = " + ulkelist);

        System.out.println("Collections.replaceAll(ulkelist,\"Güba\",\"pataGONYA\") = " + Collections.replaceAll(ulkelist, "Güba", "pataGONYA"));

        System.out.println("replaceAll sonrası  ulkelist = " + ulkelist);// [Alamanya, pataGONYA, Polkonya, Dingiltere, Amerigonya, pataGONYA]
        System.out.println("ulkelist.set(\"pataGONYA\") = " + ulkelist.set(1,"ebikGabık"));
        System.out.println("set sonrası  ulkelist = " + ulkelist);// [Alamanya, ebikGabık, Polkonya, Dingiltere, Amerigonya, pataGONYA]

        //fill()-> list'te tum elelmnalrı istenen değere update eder
        Collections.fill(ulkelist, "CerenISTAN");
        System.out.println("ulkelist = " + ulkelist);//[CerenISTAN, CerenISTAN, CerenISTAN, CerenISTAN, CerenISTAN, CerenISTAN]

    }
}