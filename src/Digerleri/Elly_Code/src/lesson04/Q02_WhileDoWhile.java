package Digerleri.Elly_Code.src.lesson04;

public class Q02_WhileDoWhile {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {
        int sayi = 5365;
        System.out.println("basamakToplami (sayi) = " + basamakToplami(sayi));
    }

    public static int basamakToplami(int sayi) {
        int toplam = 0;
        while(sayi !=0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        return toplam;
    }

}


