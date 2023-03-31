package Digerleri.CananHoca.Projeler.Mart23Tasks;
import java.util.Scanner;

public class T03_TasKagitMakas {
    public static void main(String[] args) {

        // Taş kağıt makas oyunu

        // tas > makas
        // makas > kağıt
        // kağıt > taş

        // iki oyuncu da taş, kağıt, makastan birini seçer, 3 olan kazanır

        int birinciOyuncuToplamWin=0;
        int ikinciOyuncuToplamWin= 0;

        Scanner scan = new Scanner(System.in);

        while (birinciOyuncuToplamWin < 3 && ikinciOyuncuToplamWin < 3) {
            System.out.println("Birinci Oyuncu seçim: ");
            System.out.println("tas seçmek için 0'a, makas seçmek için 1'e" +
                    ", kağıt seçmek için 2'ye basın");

            int birinciSecim= scan.nextInt();

            System.out.println("İkinci oyuncu seçim: ");
            System.out.println("tas seçmek için 0'a, makas seçmek için 1'e" +
                    ", kağıt seçmek için 2'ye basın");
            int ikinciSecim= scan.nextInt();

            if (birinciSecim==ikinciSecim) {
                System.out.println("Berabere");
            } else if ((birinciSecim == 0 && ikinciSecim == 1) || (birinciSecim == 1 && ikinciSecim == 2) ||
            birinciSecim == 2 && ikinciSecim==0) {
                birinciOyuncuToplamWin++;
                System.out.println("Birinci oyuncu puan aldı");
            } else {
                ikinciOyuncuToplamWin++;
                System.out.println("İkinci oyuncu puan aldı");
            }
        }

        if (birinciOyuncuToplamWin == 3) {
            System.out.println("oyun bitti, birinci oyuncu kazandı");
            System.out.println("Puan listesi: ");
            System.out.println("Birinci oyunun puanı: "+ birinciOyuncuToplamWin +
                    " İkinci oyuncu toplam puanı: " + ikinciOyuncuToplamWin);
        } else if (ikinciOyuncuToplamWin == 3) {
            System.out.println("oyun bitti, ikinci oyuncu kazandı");
            System.out.println("Puan listesi: ");
            System.out.println("Birinci oyunun puanı: "+ birinciOyuncuToplamWin +
                    " İkinci oyuncu toplam puanı: " + ikinciOyuncuToplamWin);
        }


    }
}

