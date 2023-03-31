package Digerleri.Elly_Code.src.lesson02;

import java.util.Scanner;

public class Q07_IfStatement {

   /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu aliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("yasiniz :");
        int yas = sc.nextInt();
        System.out.print("kilonuz :");
        int kilo = sc.nextInt();

        if(yas>0 && yas <18){
            System.out.println("18 yasindan kucukler kan bagisi yapamaz");
        }else if(yas>=18){
            if(kilo >0 && kilo<50) {
                System.out.println("18 ve 18 yasindann buyuk ve 50 kilo dan hafif olanlar kan bagisi yapamaz.");
            }else {
                System.out.println("kan bagisi yapilabilir");
            }
        }
    }


}
