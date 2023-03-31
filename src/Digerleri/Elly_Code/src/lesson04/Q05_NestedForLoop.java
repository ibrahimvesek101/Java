package Digerleri.Elly_Code.src.lesson04;

public class Q05_NestedForLoop {

    /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.

    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****
*/

    public static void main(String[] args) {

        for (int satir = 1; satir <=15; satir++) { //satir kontrolu
            for (int bosluk = 15-satir; bosluk >0; bosluk--) { //bosluk kontrolu
                System.out.print(" ");
            } for (int sutun = 1; sutun <=satir; sutun++) { //sutun kontrolu
                    System.out.print("*");
                }
                System.out.println();
        }
    }

   //  for (satir = 1; satir<=5 ; satir++) {
   //      for (int sutun = 1; sutun <=satir; sutun++) {
   //          System.out.print("*");
   //      }
   //      System.out.println();
   //  }

}