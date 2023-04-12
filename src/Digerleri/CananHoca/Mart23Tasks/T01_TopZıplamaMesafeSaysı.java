package Digerleri.CananHoca.Mart23Tasks;
import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {
    public static void main(String[] args) {
         /* HAFTANIN TASK'iiii :-)

    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru
    zıplamaktadır.
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan
    do while code blogu create ediniz.

    */

        Scanner scan = new Scanner(System.in);
        System.out.println("topun yüksekliğini giriniz: ");
        double yukseklik= scan.nextDouble();

        int yereVurmaSayisi=0;
        double topunToplamYolu=0;

        do {
            yereVurmaSayisi++;
            topunToplamYolu+=yukseklik;
            yukseklik*=(0.75); //yüksekliğin 3/4 u kadar yerden yukarı doğru

        } while (yukseklik >= 1);

        System.out.println("topun yere vurma sayısı: "+ yereVurmaSayisi);
        System.out.println("topun aldığı toplam yol: "+ topunToplamYolu);

    }
}