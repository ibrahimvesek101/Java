package Projeler.sunum_depo_proje.DepoYonetimii;

import java.util.Scanner;

public class Islemler {

    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);

    static Depo depo = new Depo();

    public static void girisEkranı() {

        System.out.println(R + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   | 1-URUN LISTESI  |            | 2-URUN TANIMLA    |     \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 3-URUN RAFLAMA  |            | 4-URUN GIRIS      |     \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-URUN CIKIS    |            | 6-CIKIS           |     \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + B);

        System.out.print("ISLEM SECİNİZ : ");
        int secim = TryCatches.intGirisi();

        switch (secim) {
            case 1:
                urunListesi();
                break;
            case 2:
                urunTanimlama();
                break;
            case 3:
                urunRaflama();
                break;
            case 4:
                urunGiris();
                break;
            case 5:
                urunCikis();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Hatali deger girdiniz");
                girisEkranı();

        }

    }

    private static void urunCikis() {
        System.out.println("Çıkış yapılacak ürünün İd no'sunu giriniz");
        int cıkısId = TryCatches.intGirisi();
        System.out.println("Çıkış yapılacak miktarı giriniz");
        int cıkısMiktarı = TryCatches.intGirisi();
        Math.abs(cıkısMiktarı);
        if (depo.urunList.contains(depo.urunList.get(cıkısId - UrunTanımlama.IdAtailk))){
            depo.urunSat(cıkısId,cıkısMiktarı);
            System.out.println("Satış işlemi başarıyla yapılmıştır"
                             +"\n Ana Menüye Yönlendiriliyorsunuz");
            System.out.println();
            girisEkranı();
        }else {
            System.out.println("agam olmayan id girdiniz . tekrar deneyin ");
            urunCikis();
        }

    }

    private static void urunGiris() {
                 System.out.println("Girmek istediğiniz ürünün İd no'sunu giriniz");
                int secim = TryCatches.intGirisi();
                System.out.println("Girilecek miktarı yazınız");
                  int girilecek = TryCatches.intGirisi();
            if (depo.urunList.contains(depo.urunList.get(secim - UrunTanımlama.IdAtailk))) {
                depo.urunGirDepoya(secim, girilecek);
                System.out.println();
                girisEkranı();
            } else {
                System.out.println("agam olmayan id girdiniz . tekrar deneyin ");
                urunGiris();
            }

        }






    private static void urunListesi() {
        depo.urunList.
                stream().
                forEach(t -> System.out.printf("%-8d%-12S%-12S%-12d%-12S%-10d \n", t.getUrunId(), t.getUrunİsim(),
                        t.getUretici(), t.getUrunMiktar(), t.getUrunBirim(), t.getRafNo()));
        girisEkranı();
    }

    private static void cikis() {
        System.out.println("Çıkış işlemini başarıyla tamamlanmıştır"+
                   "\n **************yine bekleriz**********************");
    }

    private static void urunTanimlama() {
        System.out.println("Ürününüzün ismini, üreticisini, ve birim değerini giriniz");
        depo.UrunTanımla(scan.next(), scan.next(), scan.next()); // depo class ddki parametreler girildi
        System.out.println("Depoda yeni ürününüz başarıyla tanımlandı " +
                " \n ürün Id no :" + depo.urunList.get(depo.urunList.size() - 1).getUrunId());
        girisEkranı();
    }

    private static void urunRaflama() {
        System.out.print("Urununuzun Id değerini ve atanacak raf No girinz : ");
        int rafAtanacakID = TryCatches.intGirisi();
        scan.nextLine();
        try{
            if (depo.urunList.contains(depo.urunList.get(rafAtanacakID - UrunTanımlama.IdAtailk))) {
                depo.urunRafTanımla(rafAtanacakID, scan.nextInt());
                System.out.println();
                girisEkranı();
            } else {
                System.out.println("agam olmayan id girdiniz . tekrar deneyin ");
                urunRaflama();
            }
        }catch (Exception e){
            System.out.println("agam olmayan id girdiniz . tekrar deneyin ");
            urunRaflama();
        }

        

    }
}
