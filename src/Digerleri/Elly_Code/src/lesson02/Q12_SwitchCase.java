package Digerleri.Elly_Code.src.lesson02;

import java.util.Scanner;

public class Q12_SwitchCase {
    /*
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde
          * cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
              *
          */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir harf seçiniz (A, B, C) : ");

        String harf= input.nextLine().toLowerCase();

        switch (harf){
            case ("a"):
                System.out.println("Java is easy");
                break;
            case ("b"):
                System.out.println("Java is fun");
                break;
            case ("c"):
                System.out.println("I need to study :)");
                break;
            default:
                System.out.println("Yanlış giriş yaptınız");
                break;

        }



    }
}

