package j10_MethodCreation;

import java.util.Scanner;

public class C04_ATMmethods {
    static Scanner input = new Scanner(System.in);//class level en tepeye gökdeki güneş yapıldı ki herkes ulaşabilsin
    static int bakıye = 1500;//class level en tepeye gökdeki güneş yapıldı ki herkes ulaşabilsin
    public static void islemTercih() {
        System.out.print("yapacagınız işlemi seçiniz : ");
        int secim = input.nextInt();
        switch (secim) {
            case 1://bakıye sorgulama işlemi
                bakıyeSorgula();
                sonKarar();
                break;
            case 2://Para yatırma işlemi
                System.out.println("   ***  para yatırma işleminiz yapılıyor   *** ");
                System.out.print("yatıracagınız miktarı giriniz : ");
                int yatanMiktar = input.nextInt();
                bakıye += yatanMiktar;
                System.out.println(yatanMiktar + " $    para   hesabınıza başarı ile yatırılmıştır  *** ");
                sonKarar();
                break;
            case 3://Para  çekme işlemi
                paraCek();
                sonKarar();
                break;
            case 4://Çıkış işlemi
                cıkıs();

                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar deneyiniz");
        }


    }

    private static void paraCek() {
        System.out.println("   ***  para cekme  işleminiz yapılıyor   *** ");

        System.out.println("cekmek istediğinz miktarı giriniz : ");
        int cekilenMiktar = input.nextInt();
        if (cekilenMiktar <= bakıye) {
            bakıye -= cekilenMiktar;
        } else System.out.println("yetersiz bakıye -> parasız insan gereksiz insan ");

        System.out.println("   ***  para cekme işleminiz tamamlandı  *** ");


    }

    private static void cıkıs() {
        System.out.println("   ***  çıkış işleminiz yapılıyor   *** ");
        System.out.println("   ***  çıkış  işleminiz tamamlandı  *** ");
    }

    public static void bakıyeSorgula() {
        System.out.println("   ***  bakıye sorgulama işleminiz yapılıyor   *** ");
        System.out.println("bakıyeniz : " + bakıye);
        System.out.println("   ***  bakıye sorgulama işleminiz tamamlandı  *** ");
    }

    public static void sonKarar() {
        System.out.print("işlemler devam etmek için 1 bitirmek için 0 seçiniz :  ");
        int sonKarar = input.nextInt();//Hz.dummy
        if (sonKarar == 1) {
            islemTercih();
        } else if (sonKarar == 0) {
            cıkıs();
        } else System.out.println("hatalı giriş yaptınız :( ");

    }


}