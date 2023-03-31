package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        //nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        ArrayList<String> isimList = new ArrayList<>(List.of("Aydın", "Cihat", "Ismail", "Ceren", "Furkan", "Tugba"));//çuval

        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7, "javaTAR"));//-> 7 javaTAR elemanlı lst tanımlandı

        System.out.println("yeniList = " + yeniList);//[javaTAR, javaTAR, javaTAR, javaTAR, javaTAR, javaTAR, javaTAR]

        //addAll()-> bir liste istenen listi ekler
        System.out.println("eklenmeden önce ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        ulkelist.addAll(isimList);//ulkelistin sonuna isimList elemanlarının tamamı eklendi
        System.out.println("eklenmeden sonra ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya, Aydın, Cihat, Ismail, Ceren, Furkan, Tugba]

        yeniList.addAll(3, ulkelist);//yaniList 3. indexden itibaren tum ulkeList elemanları eklendi
        System.out.println("ulkeList3. indexe eklendikten sonra yeniList = " + yeniList);

        //task: 1'den 10'a kadar sayıları liste ekleyip print eden code create ediniz...

        ArrayList<Integer> sayilar = new ArrayList<>();//boş list tanımlandı
        for (int i = 1; i <=10 ; i++) {
            sayilar.add(i);
        }
        System.out.println("sayilar = " + sayilar);//[1,2,3,4,5,6,7,8,9,10]




    }
}