package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tam sayı giriniz : ");
        int sayi = input.nextInt();

        ArrayList<Integer> asalList = new ArrayList<>();
        int sayac = 0;
        for (int i = 2; i <= sayi; i++) {
            int kontrol = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 0) {
                sayac++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(sayi + " sayısına kadar " + sayac + " adet asal sayı vardır.");
    }
}


/*          2.yöntem

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tam sayı giriniz : ");
        int sayi=input.nextInt();

        ArrayList<Integer> list=new ArrayList<>();
        int sayac=0;

        for(int i=2;i<=sayi;i++){
        boolean sonuc=true;
        for(int j=2;j<i; j++){
        if(i%j==0){
        sonuc=false;
        }
        }if(sonuc){
        list.add(i);
        }

        }System.out.println(list);
        System.out.println(sayi+" sayısına kadar "+list.size()+" adet asal sayı vardır.");
        }
        }

        */
