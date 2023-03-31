package Digerleri.interview.src.Day01;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız. ( 4 kez deneme hakkı olsun)
    public static void main(String[] args) {
        String pin="merhaba1234";
        int girisHakki=4;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Pin giriniz : "); String gPin= scanner.next();
            if (pin.equals(gPin)){
                System.out.println("Giriş başarılı"); break;
            } else {
                System.out.println("Hatalı pin"); girisHakki--;
                System.out.println("Kalan giriş hakkı : "+girisHakki);
            }
            if (girisHakki==0) {
                System.out.println("Deneme hakkınız bitti, giriş başarısız");break;
            }
        }

    }

}
