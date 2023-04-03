package Projeler.TeamWork.P03_TeamWorkProject;

import java.util.Scanner;

public class SubtractionSquare {



     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /* TASK ->
    Girilen iki tamsayı değerine kadar olan sayıların topamının karalerinin toplamını return eden substSquare
    method create ediniz.

   Örnek:

    int 1 = 10; -> (1+2+3+...+10)^2=3025

    int 2 = 5;  -> (1+2+3+...+5)^2=225

    3025 + 225 = 3250
    return 3250
    */
    public static void main(String[] args) {

        System.out.println(substSquare(4, 7));
    }

    public static int substSquare(int sayi1, int sayi2) {


        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 0; i <= sayi1; i++) {
            toplam1 += i;
        }

        for (int i = 0; i <= sayi2; i++) {
            toplam2 += i;
        }

        return (toplam1 * toplam1) + (toplam2 * toplam2);

    }

}
