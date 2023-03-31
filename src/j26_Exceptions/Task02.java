package j26_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

         /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

Trick->
sicaklikKontrol(int sıcaklık){
 throw new IOException("AGAM haba buz gibi dışarı çıkma");

}*/

        Scanner input = new Scanner(System.in);
        System.out.println("hava sıcaklığını giriniz : ");
        int sıcaklık = input.nextInt();

        try{
        sıcaklıkKontrol(sıcaklık);

        }catch (IOException e){
            System.out.println("catch block çalıştı."+e.getMessage());
        }

    }

    public static void sıcaklıkKontrol(int sıcaklık) throws IOException {
       if(sıcaklık<10){
           throw new IOException("hava buz gibi dışarı çıkma");
       }else {
           System.out.println("hava güzel");
       }

    }
}
