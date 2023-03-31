package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task22 {

    /* task->
      katsayıları a,b,c  verilen 1 bilinmeyenli
       ax^2 + bx + c denklemin köklerini print eden METHOD create ediniz.



      trick-> kokler : (-b +/- karekök(delta)) / (2*a)
        delta = b*b - 4*a*c
        delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        delta = 0 => 1 tane kök vardır x = -b/2a
        delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {

        kokBul();

    }

    private static void kokBul() {
        Scanner input = new Scanner(System.in);
        System.out.print("Köklerini hesaplamak istediğiniz denklemin\na katsayısını giriniz : ");
        double a = input.nextDouble();
        System.out.print("b katsayısını giriniz : ");
        double b = input.nextDouble();
        System.out.print("c sabit sayıyı giriniz : ");
        double c = input.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {

            System.out.println("Girdiğiniz denklemde kök yoktur.");

        } else if (delta == 0) {

            double x = (-b) / (2 * a);
            System.out.println("Girdiğiniz denklemde 1 adet kök vardır = " + x);

        } else {

            double x1 = (-b + (Math.sqrt(delta))) / (2 * a);

            double x2 = (-b - (Math.sqrt(delta))) / (2 * a);

            System.out.println("Girdiğiniz denklemde 2 adet kök vardır = " + (x1) + " ve " + (x2));
        }


    }
}
