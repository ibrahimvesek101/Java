package Digerleri.ibrahim_mnv_prj_v_2;

import java.util.Scanner;

public class AnaMenu {
    public static void giris() {

        System.out.print("\n*** Neda Manava Hoşgeldiniz ***\n\n1-Yonetici Giriş\n2-Musteri Giriş\nSeçmek istediğinizin sıra numarasını yazınız : ");
        Scanner input = new Scanner(System.in);
        int giris = input.nextInt();

        if (giris == 1) {
            Yonetici.yoneticiSifreKontrol();
        } else if (giris == 2) {
            Musteri.musteriMenu();
        } else {
            System.out.println("Lütfen doğru giriş yapınız");
            AnaMenu.giris();

        }

    }

}
