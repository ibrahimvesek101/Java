package Projeler.TeamWork.P03_TeamWorkProject;

import java.util.Scanner;

public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*
   TASK ->
   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true return eden threeEvenOrOdd method create ediniz.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
    public static void main(String[] args) {
        int arr1[]={2, 1, 3, 5};
     //   int arr2[]={2, 1, 2, 5};
     //   int arr3[]={2, 4, 2, 5};

        System.out.println(threeEvenOrOdd(arr1));
     //   System.out.println(threeEvenOrOdd(arr2));
     //   System.out.println(threeEvenOrOdd(arr3));


    }

    static boolean threeEvenOrOdd(int arr[]) {
        int countTek = 0;
        int countCift = 0;
        boolean bayrak=false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                countCift++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1){
                countTek++;
            }
        }

        if (countTek==3||countCift==3){
            bayrak=true;
        }
        return bayrak;
    }

}
