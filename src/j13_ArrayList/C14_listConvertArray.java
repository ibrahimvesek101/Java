package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class  C14_listConvertArray {
    public static void main(String[] args) {
        //list'iarray'e cevirme ->toArray();

        //1. yontem -> toArray(String[0]); toArray() parametre olarak String[0] olarak eklenir..
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval

        System.out.println("ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        String ulkeArr[] =ulkelist.toArray(new String[0]);// ulkelist elelmanları toArray method ile ulkeArr atandı
        System.out.println("Arrays.toString(ulkeArr) = " + Arrays.toString(ulkeArr));//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]

        //2. yöntem-> tanımlanan Array'in data type Object(Hz.ADEM) olarak tanımlanır..
        //Trick-> Object Class java'da tanımlı tum class'ların parent(atası) olarak tanımlanır...
        //String Integer double etc. class'lar Object child(evladı) oldugu için istene durumlarda data type olarak kullanılabilir..

        Object  ulkeArr1 []=ulkelist.toArray();//list elelmanları toArray method ile Object data type ulkeArr atandı
        System.out.println("Arrays.toString(ulkeArr1) = " + Arrays.toString(ulkeArr1));//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]

    }
}