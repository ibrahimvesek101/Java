package Projeler.TeamWork.P02_TeamWorkProject;

import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */


    /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevirip arrayı print eden code create ediniz.

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result  : Peach , Berry , Apple , WaterMelon , Apple

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] UseThisArray = myStr.split(" ");

       //  bu satirdan onceki kodlari degistirmeyiniz
       // kullanman gereken -> UseThisArray

        for (int i = 0; i < UseThisArray.length; i++) {
            if(UseThisArray[i].equals("Orange")){
                UseThisArray[i] = "Apple";
            }
        }
        System.out.println(Arrays.toString(UseThisArray));
    }
}