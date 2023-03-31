package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;


public class Task22 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input : JavaCAN'lara selam olsun
       output: maximumCounts occurring character is : a
        */

        System.out.println("Lütfen bir string giriniz");
        String input=new Scanner(System.in).nextLine().toLowerCase();

        String tmpStr = chrDistinct(input).toLowerCase();
        char[][] arrCharCounts = new char[tmpStr.length()][2];

        for (int i = 0; i < tmpStr.length(); i++) {
            arrCharCounts[i][1] = tmpStr.charAt(i);
            arrCharCounts[i][0] = (char)howManyTimes(tmpStr.charAt(i),input);
        }

        int _highest = 0; int index = 0;
        for (int i = 0; i < arrCharCounts.length; i++) {
            if (arrCharCounts[i][0]>_highest) {
                index = i; _highest = arrCharCounts[i][0];
            }
        }

        System.out.printf("char %c has been repeaded %d times ", arrCharCounts[index][1], (arrCharCounts[index][0]+0));

    }

    public static String chrDistinct(String str) {
        String tmp="";
        for (int i = 0; i <str.length(); i++) {
            if (tmp.indexOf(str.charAt(i)) == -1) {
                tmp += str.charAt(i);
            }
        }
        return tmp;
    }
    public static int howManyTimes(char character, String inputString) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}

