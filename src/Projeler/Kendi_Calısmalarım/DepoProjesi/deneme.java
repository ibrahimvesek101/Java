package Projeler.Kendi_Calısmalarım.DepoProjesi;

public class deneme {
    public static void main(String[] args) {

        System.out.print("lütfen bir sayı giriniz: ");
        int sayi = Int_Kontrol.intSayiKontrol();
        if (sayi < 10 && sayi >= 0) {
            System.out.println("rakam girişi yapıldı");
        } else System.out.println("girdiğiniz sayı rakam değildir.");

    }
}