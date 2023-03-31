package Projeler.TeamWork.P02_TeamWorkProject;

import java.util.Arrays;
import java.util.Scanner;

public class arrayContains {

    /*
        Given two arrays of ints sorted in increasing order,
        outer and inner,
        return true if all of the numbers in inner appear in outer.
        Verify first array contains second array.

        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    /*

         Artan düzende sıralanmış iki adet ınt array için
         İlk arrayin ikinci arrayi içerdiğini  kontrol eden code create ediniz.

         linearIn([1, 2, 4, 6], [2, 4]) → true
         linearIn([1, 2, 4, 6], [2, 3, 4]) → false
         linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();

        String[] arr = myStr.split(" ");

        int[] myArr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];

        for (int i = 0; i < 3; i++) {
            UseThisArray1[i] = myArr[i];
        }

        for (int i = 3; i < 5; i++) {
            UseThisArray2[i - 3] = myArr[i];
        }

        //Code start here
        //Use the array name UseThisArray1 and UseThisArray2

        //  bu satirdan onceki kodlari degistirmeyiniz
        // UseThisArray1 ve UseThisArray2 array isimlerini kullanınız.
        boolean bayrak = false;

        for (int j = 0; j < UseThisArray2.length; j++) {
            for (int i = 0; i < UseThisArray1.length; i++) {
                if (UseThisArray1[i] == UseThisArray2[j]) {
                    bayrak = true;
                }
            }
        }
        System.out.println(bayrak);
    }
}
