package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {

    public static void main(String[] args) {
        //King of Trick -> Array'dan liste cevirme yapıldıgında list kaynagı array oldugu için list array gibi davranır:
        //eleman aklem ve silme yapılamaz-> add() remove() çalışmaz
        String ulkeArr[]={"Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"};//çuval
        List<String> ulkeList=Arrays.asList(ulkeArr);//ulkeArr elemanları ulkelist'e atandı

        System.out.println("Arrays.toString(ulkeArr) = " + Arrays.toString(ulkeArr));//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        System.out.println("ulkeList = " + ulkeList);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        //  System.out.println("ulkeList.remove(\"Güba\") = " + ulkeList.remove("Güba"));//RTE -> UnsupportedOperationException
        //  System.out.println("ulkeList.add(\"seilCAN haluk\") = " + ulkeList.add("sefilCAN haluk"));//RTE -> UnsupportedOperationException

    }
}