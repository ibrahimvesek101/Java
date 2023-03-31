package Digerleri.ibrahim_mnv_prj_v_2;

import java.util.Scanner;

public class Karar {

    public static void menuVeyaCikisYonetici() {
        System.out.print("\n1-Menüye dönmek\n2-Çıkış\nSeçmek istediğinizin sıra numarasını yazınız : ");

        Scanner input = new Scanner(System.in);

        int karar = input.nextInt();

        if (karar == 1) {
            Yonetici.yoneticiMenu();
        } else if (karar == 2) {
            Cikis.cikisYonetici();
        } else {
            System.out.println("Lütfen doğru giriş yapınız");
            menuVeyaCikisYonetici();
        }
    }

    public static void menuVeyaCikisMusteri() {
        System.out.print("1-Menüye dönmek\n2-Çıkış\nSeçmek istediğinizin sıra numarasını yazınız : ");
        Scanner input = new Scanner(System.in);
        int karar = input.nextInt();
        if (karar == 1) {
            Musteri.musteriMenu();
        } else if (karar == 2) {
            Cikis.cikisMusteri();
        } else {
            System.out.println("Lütfen doğru giriş yapınız");
            menuVeyaCikisMusteri();

        }
    }
}
