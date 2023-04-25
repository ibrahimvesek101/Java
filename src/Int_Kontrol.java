import java.util.Scanner;

public class Int_Kontrol {
    static Scanner input = new Scanner(System.in);

    public static int sayıAlKontrolEt() {

        boolean bayrak = true;
        int sayi = 0;

        System.out.print("Sayı giriniz : ");
        while (bayrak) {
            try {
                sayi = Integer.parseInt(input.nextLine());
                bayrak = false;
            } catch (Exception e) {
                System.out.println("Yanlış giriş. Lütfen bir sayı giriniz : ");
            }
        }
        return sayi;
    }


    public static void main(String[] args) {


        int secim;

        while (true) {
            try {
                secim = Integer.parseInt(input.next());  //integer giris yapilana kadar while
                break;
            } catch (Exception e) {
                System.out.print("Girişiniz bir rakam olmalı. Lutfen bir rakam tuslayin: ");
            }


        }
    }

    public void intSayiKontrol(int sayi){

        while (true) {
            try {
                sayi = Integer.parseInt(input.next());  //integer giris yapilana kadar while
                break;
            } catch (Exception e) {
                System.out.print("Girişiniz bir rakam olmalı. Lutfen bir rakam tuslayin: ");
            }
        }

    }
}