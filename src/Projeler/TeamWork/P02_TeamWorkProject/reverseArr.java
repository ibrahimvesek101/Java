package Projeler.TeamWork.P02_TeamWorkProject;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {

      /*
        Given String array

        reverse the String array

        print the reversed array

     */


    /*

          Verilen String array ters çevirip print eden code create ediniz.

     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");


        // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
        String ters[] = new String[useThisArray.length];
        int a = 0;
        for (int i = useThisArray.length-1; i >= 0; i--) {

            ters[a] = useThisArray[i];
            a++;
        }
        System.out.println(Arrays.toString(ters));
    }
}