package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {

        //girilen pin 3 giriş hakkı kontrolü yapalım;


        Scanner input = new Scanner(System.in);


int girisHakki=3;
String pin ="selam";

while (girisHakki>0){
    System.out.print("Pin giriniz : ");
    if (pin.equals(input.nextLine())){
        System.out.println("Pin girişi başarılı");
        break;
    }else {
        System.out.print("Pin giriniz : ");
        girisHakki--;
        System.out.println();
        System.out.println("Pin için kalan hakkınız = " +girisHakki);

if (girisHakki==0){
    System.out.println("3 defa yanlış giriş yaptığınız için pin bloke oldu.");
}
    }
}

    }
}
