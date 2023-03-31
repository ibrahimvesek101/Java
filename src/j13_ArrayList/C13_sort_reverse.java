package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class C13_sort_reverse {
    public static void main(String[] args) {
        //sort():-> list elelmanlarını NATUREL sıralama yapar

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("sortingen öncesi ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        Collections.sort(ulkelist);//sort return type void oldg sout  run edilmez
        System.out.println("sortingen sonrası ulkelist = " + ulkelist);//[Alamanya, Amerigonya, Dingiltere, Güba, Polkonya]

        //****Çoooğğğ Önemli :) Ahan da TRICK köşesinde böğünn: reverse() method list elemanlarını index sırasına göre ters sıralar..

        ArrayList<String> cityList = new ArrayList<>(Arrays.asList("Angara", "Gonya", "Maraş", "Ayıntap", "Süvas"));//çuval
        System.out.println("reverse öncesi  cityList = " + cityList);//[Angara, Gonya, Maraş, Ayıntap, Süvas]

        Collections.reverse(cityList);

        System.out.println("reverse sonrası cityList = " + cityList);


    }
}