package j09_Break_Continue;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> girilen 7 tamsyının 10 ile 20
        // arasındakileri hariç toplamını print eden code create ediniz.
        Scanner input = new Scanner(System.in);

        int toplam = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print(i + ". sayı giriniz : ");
            int sayi = input.nextInt();
            if (sayi > 10 && sayi < 20) {
                System.out.println("Girtiğiniz sayı 10-20 arası toplayamam :( ");
                continue;
            }
            toplam += sayi;
        }
        System.out.println("toplam = " + toplam);
    }
}
