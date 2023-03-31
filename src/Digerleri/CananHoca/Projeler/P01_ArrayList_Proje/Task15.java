package Digerleri.CananHoca.Projeler.P01_ArrayList_Proje;

import java.util.ArrayList;
import java.util.List;

public class Task15 {
        /* TASK :
        100 den kucuk asal sayilari yazdiran bir code create ediniz.
        output= (3,5,7,11,13...

        sayi döngüsü= 2 ten 100 e kadar gidecek
        bölünecek sayılar döngüsü= sayının bölünebiliriliğini kontrol edecek

         */

    public static void main(String[] args) {

        List<Integer> asalSayilar= new ArrayList<>();// boş liste

        for (int sayi = 2; sayi < 100; sayi++) { // sayi = 2/ 3 / 4 / 5
            boolean asalmi=true;
            for (int j = 2; j < sayi; j++) { // j= 2/ 2 / 2,3 / 2,3,4
                if (sayi % j ==0) { // eğer herhangi bir sayıya bölünebiliyorsa...
                    asalmi=false; //.... sayı asal değil
                }
            }
            if(asalmi) asalSayilar.add(sayi);
        }

        System.out.println("100 e kadar olan asal sayılar ");
        System.out.println(asalSayilar);

    }
}