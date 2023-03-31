package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class C08_subList {
    public static void main(String[] args) {
        //sublist() -> listini istenen list parcasını return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.subList(1,4) = " + ulkelist.subList(1, 4));//1. 2. ve 3. inded elelmalrı return edildi  [Güba, Polkonya, Dingiltere]
        ArrayList<String> ebikGabıkList = new ArrayList<>(ulkelist.subList(2,5));//ulkeListin subList retun'u egikGabıkliste atandı
        System.out.println("ebikGabıkList = " + ebikGabıkList);//[Polkonya, Dingiltere, Amerigonya]
        //   ulkelist.subList(3);//CTE
    }
}