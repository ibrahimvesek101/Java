package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C11_remove {
    public static void main(String[] args) {
        //remove()-> list'te istenen elemanı siler

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.remove(\"Angara\") = " + ulkelist.remove("Angara"));//false
        System.out.println("ulkelist.remove(\"Güba\") = " + ulkelist.remove("Güba"));//true
        //   System.out.println("ulkelist.remove(21) = " + ulkelist.remove(21));//olmayan index RTE IndexOutOfBoundsException
        System.out.println("ulkelist.remove(3) = " + ulkelist.remove(3));//Amerigonya

        // ahanda TRıck köşesinde böğün: remove(index)-> silinen elemanı return eder:kelle
        //                               remove(eleman)-> silinen elemanıtrue/false return eder : rapor

        ArrayList<String> cityList = new ArrayList<>(Arrays.asList("Angara", "Gonya", "Maraş", "Ayıntap", "Süvas"));//çuval
        System.out.println("citylist eklenmeden önce ulkelist = " + ulkelist);//[Alamanya, Polkonya, Dingiltere]
        ulkelist.addAll(cityList);
        System.out.println("remove öncesi ulkelist = " + ulkelist);//[Alamanya, Polkonya, Dingiltere, Angara, Gonya, Maraş, Ayıntap, Süvas]
        System.out.println("remove öncersi cityList = " + cityList);//[Angara, Gonya, Maraş, Ayıntap, Süvas]

        System.out.println("cityList.removeAll(cityList) = " + cityList.removeAll(cityList));//true
        System.out.println("cityList.removeAll(ulkelist) = " + cityList.removeAll(ulkelist));//false
        System.out.println("ulkelist.removeAll(cityList) = " + ulkelist.removeAll(cityList));//false
        System.out.println("remove ulkelist = " + ulkelist);//[Alamanya, Polkonya, Dingiltere, Angara, Gonya, Maraş, Ayıntap, Süvas]
        System.out.println("remove sonrası cityList = " + cityList);//[]

    }
}
