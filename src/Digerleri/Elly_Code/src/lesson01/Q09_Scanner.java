package Digerleri.Elly_Code.src.lesson01;

import java.util.Scanner;

public class Q09_Scanner {

    //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
    //  cevre = 2Pİr alan = Pİ(r*r)
    //  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
    //  Isim – soyisim : Elly Dainty
    //  Kullanicidan ismini alip isminin bas harfini yazdirin.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cemberin yaricapi :");
        double yaricap = sc.nextDouble();

        System.out.println("yaricap : " + yaricap);
        System.out.println("cemberin cevresi :" + 2*3.14*yaricap);
        System.out.println("cemberin alani :" + 3.14*yaricap*yaricap);
        System.out.println("cemberin alani Math ile : "+ 3.14 *Math.pow(yaricap,2));



        System.out.println("lutfen isminizi giriniz :");
        char ilkHarf = sc.next().charAt(0);

        System.out.println("girdiginiz ismin ilk harfi : " + ilkHarf);
    }

}
