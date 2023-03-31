package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz


         */

        Scanner input = new Scanner(System.in);

        System.out.println("ehliyetiniz varsa E , yoksa H girin");

        char ehliyet = input.nextLine().charAt(0);


        if (ehliyet == 'E' || ehliyet == 'e') {

            System.out.println("yıl tecrübenizi giriniz");
            int yil = input.nextInt();
            if (yil >= 7) {
                System.out.println("mesafeyi giriniz  ");
                int km = input.nextInt();
                if (km >= 100000) {
                    System.out.println("alahtarı alabilirsin");
                } else System.out.println("daha " + (100000 - km) + " eksiğiniz var");

            } else System.out.println(" kontak için " + (7 - yil) + " eksiğin var.");

        } else if (ehliyet == 'H' || ehliyet == 'h') {
            System.out.println("anahtar için ehliyet gerekli");

        } else System.out.println("lütfen doğru giriş yapınız.");


    }
}

