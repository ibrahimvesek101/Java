package Projeler.TeamWork.P02_TeamWorkProject;

import java.util.Objects;
import java.util.Scanner;

public class sameFirstAndLast {
   /*

    Given an array of ints, print true if the array is length 1 or more, and the first element and the last element are equal.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    print just true or false

    */


    /*

    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk ve son elemanın  eşitliğini kontrol eden code create ediniz..

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    sadece  true veya false print et

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

        // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin




            if (Objects.equals(useThisArray[0], useThisArray[useThisArray.length - 1])){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }


    }

