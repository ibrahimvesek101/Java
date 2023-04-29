package Projeler.Kendi_Calısmalarım.DepoProjesi;

import java.util.HashMap;
import java.util.Scanner;

public class Methods {
    static Scanner input = new Scanner(System.in);
    static HashMap<Integer, Urunler> urunlerMap = new HashMap<>();

    public static void depoGiris() {


        // RAF GÜNCELLEME menüsü gereksiz fakat taskta istediği için koydum.
        // ÜRÜN GÜNCELLEME kısmında istediğiniz güncellemeyi yapabilirsiniz.


        System.out.print("\n" + "           ==NEDACAN DEPO YONETIM SISTEMI==            \r\n"
                + "     \n"
                + "    1-URUN TANIMLAMA               2-ÜRÜN GÜNCELLEME  \n"
                + "     \n"
                + "    \n"
                + "    3-RAF GUNCELLEME               4-URUN SILME         \n"
                + "    \n"
                + "\n"
                + "    5-URUN LİSTELE                 6-CIKIS               \n" +
                "\nLutfen Yapmak Istediginiz Islem Numarasini Giriniz: "
        );


        switch (Int_Kontrol.intSayiKontrol()) {
            case 1:
                urunTanimla();
                depoGiris();
                break;

            case 2:
                urunGuncelle();
                depoGiris();
                break;
            case 3:
                rafGuncelle();
                depoGiris();
                break;
            case 4:
                urunSil();
                depoGiris();
                break;
            case 5:
                urunListele();
                depoGiris();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Girdiğiniz değer yanlış. Tekrar deneyiniz.");
                depoGiris();
                break;
        }
    }

    private static void urunGuncelle() {
        System.out.print("\n*** ÜRÜN GÜNCELLEME MENÜSÜ ***\n\n1-İsim Güncelleme\n2-Üretici Güncelleme\n3-Miktar Güncelleme\n4-Birim Güncelleme\n5-Raf Güncelleme\nSeçmek istediğinizin sıra numarasını giriniz : ");


        switch (Int_Kontrol.intSayiKontrol()) {
            case 1:
                System.out.print("Lutfen İsmini Guncellemek Istediginiz Urunun Id'sini Giriniz: ");
                int girilenId1 = Int_Kontrol.intSayiKontrol();

                if (urunlerMap.keySet().contains(girilenId1)) {
                    System.out.print(girilenId1+" id nolu ürün için yeni isim giriniz: ");
                    String yeniİsim=input.nextLine();

                    urunlerMap.get(girilenId1).setUrunAdı(yeniİsim);

                    System.out.println(girilenId1 + " id nolu ürünün ismi güncellendi. " +
                            "Ürünün güncel hali aşağıdaki gibidir: \n" + urunlerMap.get(girilenId1));

                } else {
                    System.out.println("Aradıgınız Urun Sistemde Yok. Sistemdeki Urunleriniz Asagidaki Gosterilmistir");
                    urunListele();
                }

                depoGiris();
                break;

            case 2:
                System.out.print("Lutfen Üreticisini Guncellemek Istediginiz Urunun Id'sini Giriniz: ");
                 int girilenId2=Int_Kontrol.intSayiKontrol();

                if (urunlerMap.keySet().contains(girilenId2)) {
                    System.out.print(girilenId2+" id nolu ürün için yeni üretici giriniz: ");
                    String yeniÜretici=input.nextLine();

                    urunlerMap.get(girilenId2).setUretici(yeniÜretici);

                    System.out.println(girilenId2 + " id nolu ürünün üreticisi güncellendi. " +
                            "Ürünün güncel hali aşağıdaki gibidir: \n" + urunlerMap.get(girilenId2));

                } else {
                    System.out.println("Aradıgınız Urun Sistemde Yok. Sistemdeki Urunleriniz Asagidaki Gosterilmistir");
                    urunListele();
                }
                depoGiris();
                break;


            case 3:
                System.out.print("Lutfen Miktarını Guncellemek Istediginiz Urunun Id'sini Giriniz: ");
                int girilenId3 = Int_Kontrol.intSayiKontrol();

                if (urunlerMap.keySet().contains(girilenId3)) {
                    System.out.print(girilenId3+" id nolu ürün için yeni miktar giriniz: ");
                    int yeniMiktar=Int_Kontrol.intSayiKontrol();

                    urunlerMap.get(girilenId3).setMiktar(yeniMiktar);

                    System.out.println(girilenId3 + " id nolu ürünün miktarı güncellendi. " +
                            "Ürünün güncel hali aşağıdaki gibidir: \n" + urunlerMap.get(girilenId3));

                } else {
                    System.out.println("Aradıgınız Urun Sistemde Yok. Sistemdeki Urunleriniz Asagidaki Gosterilmistir");
                    urunListele();
                }
                depoGiris();
                break;
            case 4:
                System.out.print("Lutfen Birimini Guncellemek Istediginiz Urunun Id'sini Giriniz: ");
                int girilenId4 = Int_Kontrol.intSayiKontrol();

                if (urunlerMap.keySet().contains(girilenId4)) {
                    System.out.print(girilenId4+" id nolu ürün için yeni birim giriniz: ");
                    String yeniBirim=input.nextLine();

                    urunlerMap.get(girilenId4).setBirim(yeniBirim);

                    System.out.println(girilenId4 + " id nolu ürünün birimi güncellendi. " +
                            "Ürünün güncel hali aşağıdaki gibidir: \n" + urunlerMap.get(girilenId4));

                } else {
                    System.out.println("Aradıgınız Urun Sistemde Yok. Sistemdeki Urunleriniz Asagidaki Gosterilmistir");
                    urunListele();
                }
                depoGiris();
                break;
            case 5:
                System.out.print("Lutfen Rafını Guncellemek Istediginiz Urunun Id'sini Giriniz: ");
                int girilenId5 = Int_Kontrol.intSayiKontrol();

                if (urunlerMap.keySet().contains(girilenId5)) {
                    System.out.print(girilenId5+" id nolu ürün için yeni raf numarası giriniz: ");
                    String yeniRaf=input.nextLine();

                    urunlerMap.get(girilenId5).setRaf(yeniRaf);

                    System.out.println(girilenId5 + " id nolu ürünün raf numarası güncellendi. " +
                            "Ürünün güncel hali aşağıdaki gibidir: \n" + urunlerMap.get(girilenId5));

                } else {
                    System.out.println("Aradıgınız Urun Sistemde Yok. Sistemdeki Urunleriniz Asagidaki Gosterilmistir");
                    urunListele();
                }
                depoGiris();
                break;

            default:
                System.out.println("Seçeneklerin dışında giriş yapıldı. Tekrar deneyiniz.");
                urunGuncelle();
        }
    }

    private static void urunSil() {
        System.out.print("Lütfen Silmek İstediğiniz Ürünün Id'sini Giriniz: ");
        int silinecekId = Int_Kontrol.intSayiKontrol();
   //     urunlerMap.remove(silinecekId);
   //     System.out.println(silinecekId + " id nolu ürün başarılı bir şekilde silinmiştir.");


        if (urunlerMap.keySet().contains(silinecekId)) {
            urunlerMap.remove(silinecekId);
            System.out.println(silinecekId + " id nolu ürün başarılı bir şekilde silinmiştir.");

        } else {
            System.out.println("Aradıgınız Urun Sistemde Yok. Sistemdeki Urunleriniz Asagidaki Gosterilmistir");
            urunSil();
        }

    }

    private static void rafGuncelle() {
        System.out.print("Lutfen Rafini Guncellemek Istediginiz Urunun Id'sini Giriniz: ");
        int arananId = Int_Kontrol.intSayiKontrol();

        if (urunlerMap.keySet().contains(arananId)) {
            System.out.print("Yeni raf numarasını giriniz: ");
            int yeniRaf = Int_Kontrol.intSayiKontrol();

            urunlerMap.get(arananId).setRaf(String.valueOf(yeniRaf));   //pojo da Raf String tanımlamışım .Değiştirmek istemedim.- String.valueOf(yeniRaf)-

            System.out.println(arananId + " id nolu ürünün rafi güncellendi. Atanan yeni raf numarası : " + urunlerMap.get(arananId).getRaf());


        } else {
            System.out.println("Aradıgınız Urun Sistemde Yok. Sistemdeki Urunleriniz Asagidaki Gosterilmistir");
            urunListele();
        }

    }

    private static void cikis() {
        System.out.println("Sistemden çıkış yaptınız... ");
        System.exit(0);
    }

    private static void urunListele() {

        System.out.println("\n                      ****  ÜRÜN LİSTESİ ****");
        System.out.println(urunlerMap.toString().toUpperCase());

    }
    private static void urunTanimla() {
        int id = 100;
        while (true) {
            if (urunlerMap.containsKey(id)) {
                id++;
            } else break;
        }
        System.out.print("Urun Ismini Giriniz : ");
        String urunAdı = input.nextLine();

        System.out.print("Uretici Bilgisi Giriniz : ");
        String uretici = input.nextLine();

        System.out.print("Urun Birimi Giriniz : ");
        String birim = input.nextLine();

        System.out.print("Urun Miktar Giriniz : ");
        int miktar = Int_Kontrol.intSayiKontrol();

        System.out.print("Urun Icin Raf Bilgisi Giriniz : ");
        String raf = input.nextLine();

        Urunler urun=new Urunler(urunAdı,uretici,miktar,birim,raf);
        urunlerMap.put(id, urun);
        System.out.println("Ürününüz başarılı bir şekilde eklenmiştir. Eklenen ürün bilgileri aşağıdaki gibidir:");
        System.out.println("id: " + id + " : " + urunlerMap.get(id));
        depoGiris();

    }
}
