import java.util.Scanner;

public class Int_Kontrol {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Method nasıl çalışıyor diye switch create ettim...
        //main olmasa da olur... sadece intSayiKontrol() methodunu kullanınız..


        System.out.print("raf no giriniz: ");
        switch (intSayiKontrol()) {
            case 1:
                System.out.println("1.seçenek seçildi.");
                break;
            case 2:
                System.out.println("2.seçenek seçildi.");
                break;
            default:
                System.out.println("Yanlış giriş yapıldı. Tekrar deneyiniz.");
        }
    }


    // parametresiz, return type int olan bir method create edildi.int kontrol edildi...

    public static int intSayiKontrol() {
        int sayi;
        while (true) {
            try {
                sayi = Integer.parseInt(input.next());  //integer giris yapilana kadar while
                return sayi;
            } catch (Exception e) {
                System.out.print("Girişiniz bir rakam olmalı. Lutfen bir rakam tuslayin: ");
            }
        }

    }


}