package j08_Loops.Loop03_DoWhileLoop;

public class C01_DoWhileLoop {

    public static void main(String[] args) {
/*
        While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
        do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise loop devam eder.
        sart false ise loop kırılır ve loopdan sonraki ilk satır çalışır.
        do-While loop->  game app. de daha çok kullanılır.
        Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
        en az bir kez çalışır..

         */

        int yas = 41;
        while (yas > 40) {

            System.out.println("ismail bey :) yasınız : " + yas + " gayet başarılı while body action aldı");
            yas--;

        }

        do {
            System.out.println("ismail bey :) yasınız : " + yas + " gayet başarılı do-while body action aldı");
            yas--;
        }while (yas > 40);
    }
}