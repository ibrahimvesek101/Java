package Digerleri.ibrahim_mnv_prj_v_2;

import java.util.Scanner;

public class SatinAlma {

    static Scanner input = new Scanner(System.in);

    public static void satinAlmaHesap() {
        System.out.print("\n1-Elma\n2-Portakal\n3-Muz\n4-Nar\n" +
                "Satın almak istediğiniz ürünün sıra numarasını giriniz : ");
        int secim = input.nextInt();
        switch (secim) {

            case 1:
                System.out.print("Kaç kg elma satın almak istiyorsunuz ? ");
                int elmaKg = input.nextInt();
                if (elmaKg <= UrunStok.elmaMiktari) {
                    if ((elmaKg * Urunler.elmaFiyat) <= Muhasebe.manavKartBakiye) {
                        System.out.println("\n***** Neda Manav Fiş *****\nSATIN ALINAN ÜRÜN= ELMA\n" +
                                "ELMA kg BİRİM FİYATI = " + Urunler.elmaFiyat + " TL\n" +
                                "SATIN ALINAN MİKTAR = " + elmaKg + " kg\n" +
                                "TOPLAM TUTAR = " + (elmaKg * Urunler.elmaFiyat) + " TL\n" +
                                "KALAN BAKİYENİZ = " + ((Muhasebe.manavKartBakiye) - (elmaKg * Urunler.elmaFiyat)) + " TL\n" +
                                "Afiyet olsun yine bekleriz..");

                    } else {
                        System.out.println("Maalesef bakiyeniz yetersiz");
                    }

                } else {
                    System.out.println("Maalesef stoklarımızda o kadar elma bulunmamaktadır.");
                }
                break;

            case 2:
                System.out.print("Kaç kg portakal satın almak istiyorsunuz ? ");
                int portakalKg = input.nextInt();
                if (portakalKg <= UrunStok.portakalMiktari) {
                    if ((portakalKg * Urunler.portakalFiyat) <= Muhasebe.manavKartBakiye) {
                        System.out.println("\n***** Neda Manav Fiş *****\nSATIN ALINAN ÜRÜN= PORTAKAL\n" +
                                "PORATAL kg BİRİM FİYATI = " + Urunler.portakalFiyat + " TL\n" +
                                "SATIN ALINAN MİKTAR = " + portakalKg + " kg\n" +
                                "TOPLAM TUTAR = " + (portakalKg * Urunler.portakalFiyat) + " TL\n" +
                                "KALAN BAKİYENİZ = " + ((Muhasebe.manavKartBakiye) - (portakalKg * Urunler.portakalFiyat)) + " TL\n" +
                                "Afiyet olsun yine bekleriz..");

                    } else {
                        System.out.println("Maalesef bakiyeniz yetersiz");
                    }

                } else {
                    System.out.println("Maalesef stoklarımızda o kadar portakal bulunmamaktadır.");
                }
                break;

            case 3:
                System.out.print("Kaç kg muz satın almak istiyorsunuz ? ");
                int muzKg = input.nextInt();
                if (muzKg <= UrunStok.muzMiktari) {
                    if ((muzKg * Urunler.muzFiyat) <= Muhasebe.manavKartBakiye) {
                        System.out.println("\n***** Neda Manav Fiş *****\nSATIN ALINAN ÜRÜN= MUZ\n" +
                                "MUZ kg BİRİM FİYATI = " + Urunler.muzFiyat + " TL\n" +
                                "SATIN ALINAN MİKTAR = " + muzKg + " kg\n" +
                                "TOPLAM TUTAR = " + (muzKg * Urunler.muzFiyat) + " TL\n" +
                                "KALAN BAKİYENİZ = " + ((Muhasebe.manavKartBakiye) - (muzKg * Urunler.muzFiyat)) + " TL\n" +
                                "Afiyet olsun yine bekleriz..");

                    } else {
                        System.out.println("Maalesef bakiyeniz yetersiz");
                    }

                } else {
                    System.out.println("Maalesef stoklarımızda o kadar muz bulunmamaktadır.");
                }
                break;

            case 4:
                System.out.print("Kaç kg nar satın almak istiyorsunuz ? ");
                int narKg = input.nextInt();
                if (narKg <= UrunStok.narMiktari) {
                    if ((narKg * Urunler.narFiyat) <= Muhasebe.manavKartBakiye) {
                        System.out.println("\n***** Neda Manav Fiş *****\nSATIN ALINAN ÜRÜN= NAR\n" +
                                "NAR kg BİRİM FİYATI = " + Urunler.narFiyat + " TL\n" +
                                "SATIN ALINAN MİKTAR = " + narKg + " kg\n" +
                                "TOPLAM TUTAR = " + (narKg * Urunler.narFiyat) + " TL\n" +
                                "KALAN BAKİYENİZ = " + ((Muhasebe.manavKartBakiye) - (narKg * Urunler.narFiyat)) + " TL\n" +
                                "Afiyet olsun yine bekleriz..");

                    } else {
                        System.out.println("Maalesef bakiyeniz yetersiz");
                    }

                } else {
                    System.out.println("Maalesef stoklarımızda o kadar nar bulunmamaktadır.");
                }
                break;


        }
    }
}
