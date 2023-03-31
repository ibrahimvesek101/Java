package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task27 {
    /*
   task->
   belirli bir yukseklikten bırakılan top atildigi yuksekligin 3/4 u kadar
    yerden yukari dogru ziplamaktadir
    Topun ziplama  yuksekligi 1 metrenin altina dşütüğü ana kadar topun
     aldigi toplam yolu ve yere vurma sayisini print eden METHOD  create ediniz.
*/
    static int sayac = 0;

    public static void main(String[] args) {

        topunAldigiYoluBul();
        topunYereVurmaSayisiBul();

    }
    private static void topunAldigiYoluBul() {
        Scanner input = new Scanner(System.in);
        System.out.print("Topun bırakıldığı yüksekliği giriniz : ");
        double sayi = input.nextDouble();
        double yol = 0;

        for (double i = sayi; i >= 1; i *= 3.0 / 4) {
            if (sayi == i) {
                yol = yol + i;
            } else {
                yol = yol + 2 * i;
                sayac++;
            }
        }
        System.out.println("Toplam alınan yol = " + (yol));
    }
    private static void topunYereVurmaSayisiBul() {
        System.out.println("Topun yere vurma sayısı = " + (1+sayac));
    }
}
