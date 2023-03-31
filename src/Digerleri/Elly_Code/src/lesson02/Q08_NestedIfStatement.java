package Digerleri.Elly_Code.src.lesson02;

import java.util.Scanner;

public class Q08_NestedIfStatement {
    /*
        Kullanici dan yas bilgisini alarak
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("yasiniz :");
        int yas = sc.nextInt();

        if(yas>=18){
            System.out.println("yas oy kullanmaya uygun");
            if(yas>=70){
                System.out.println("uc kez oy kullanabilirsn");
            }else if(yas>=50){ //70>yas>=50 -  50 51 51...69
                System.out.println("iki kez oy kullanabilirsn");
            }else { //50>yas>=18
                System.out.println("bir kez oy kullanabilirsn");
            }
        }else System.out.println("oy kullanmak icin 18 yas ve ustu olman gerekir");

    }

}