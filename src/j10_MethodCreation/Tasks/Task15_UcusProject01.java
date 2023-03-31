package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task15_UcusProject01 {

    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */
    static Scanner input = new Scanner(System.in);//güneşimiz tüm gezegenler için ortak erişimde

    public static void main(String[] args) {


        ucretHesapla();


    }

    private static void ucretHesapla() {

        System.out.print("Lütfen gitmek istediğiniz şehri giriniz (b,c,d) : ");
        char sehir = input.nextLine().toLowerCase().charAt(0);

        double biletFiyat = 0.10;

        switch (sehir) {

            case 'b':
                System.out.print("Lütfen yaşınızı giriniz :");
                int yas = input.nextInt();
                if (yas < 12) {

                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();

                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = ((biletFiyat * 500) * 0.5);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = (((biletFiyat * 500) * 0.5) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;

                    }

                } else if (12 < yas && yas < 24) {
                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();
                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = ((biletFiyat * 500) * 0.9);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:
                            double toplamTutar2 = (((biletFiyat * 500) * 0.9) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;
                    }
                } else if (yas > 65) {
                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();
                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = ((biletFiyat * 500) * 0.7);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = (((biletFiyat * 500) * 0.7) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;
                    }

                } else {
                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();
                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = (biletFiyat * 500);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = ((biletFiyat * 500) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;
                    }
                }

                break;
            case 'c':

                System.out.print("Lütfen yaşınızı giriniz : ");
                yas = input.nextInt();
                if (yas < 12) {

                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();

                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = ((biletFiyat * 700) * 0.5);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = (((biletFiyat * 700) * 0.5) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;

                    }

                } else if (12 < yas && yas < 24) {
                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();
                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = ((biletFiyat * 700) * 0.9);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = (((biletFiyat * 700) * 0.9) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;
                    }
                } else if (yas > 65) {
                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();
                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = ((biletFiyat * 700) * 0.7);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = (((biletFiyat * 700) * 0.7) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;
                    }

                } else {
                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();
                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = (biletFiyat * 700);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = ((biletFiyat * 700) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;
                    }
                }

                break;
            case 'd':

                System.out.print("Lütfen yaşınızı giriniz :");
                yas = input.nextInt();
                if (yas < 12) {

                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();

                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = ((biletFiyat * 900) * 0.5);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = (((biletFiyat * 900) * 0.5) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;

                    }

                } else if (12 < yas && yas < 24) {
                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();
                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = ((biletFiyat * 900) * 0.9);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = (((biletFiyat * 900) * 0.9) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;
                    }
                } else if (yas > 65) {
                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();
                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = ((biletFiyat * 900) * 0.7);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = (((biletFiyat * 900) * 0.7) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;
                    }

                } else {
                    System.out.print("1-Tek yön\n2-Gidiş-dönüş\nSeçiminizin sıra numarasını tuşlayın : ");
                    int biletYon = input.nextInt();
                    switch (biletYon) {
                        case 1:
                            double toplamTutar1 = (biletFiyat * 900);
                            System.out.println("toplamTutar = " + toplamTutar1 + " $");
                            break;
                        case 2:

                            double toplamTutar2 = ((biletFiyat * 900) * 0.8) * 2;
                            System.out.println("toplamTutar = " + toplamTutar2 + " $");
                            break;
                    }
                }

                break;
        }
    }

}
