package j07_StringManipulation;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
          /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> exclusive/haric
         */

        String str = "madem geldin dünyaya otur çalış JAVA'ya :)";

        System.out.println(str.substring(10));//in dünyaya otur çalış JAVA'ya :)
        System.out.println(str.substring(10, 17));//in düny


        // str 'deki son 10 karakteri print eden code create ediniz
        System.out.println(str.substring(str.length() - 10));//AVA'ya :)

        // str 'deki ilk 10 karakteri print eden code create ediniz
        System.out.println(str.substring(0, 10));//0,1,2..9 ->madem geld

        // str 'deki ilk  karakteri print eden code create ediniz
        System.out.println(str.substring(0, 1));//0->m
        // str 'deki son karakteri print eden code create ediniz
        System.out.println(str.substring(str.length() - 1));// )




        //task -> girilen 4 harfli kelimeyi tersten print eden code create ediniz. kale -> elak

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 4 harfli bir kelime giriniz : ");
        String kelime = input.nextLine();

        if (kelime.length()==4){
            System.out.println(""+kelime.charAt(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0));

        }else System.out.println("giriş hatalı");
    }
}