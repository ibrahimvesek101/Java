package Digerleri.Elly_Code.src.lesson04;

import java.util.Scanner;

public class Q01_MetCreationForLoop {
    /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("bir string girer misniz : ");
        String str = sc.nextLine();

        System.out.println(reverseString(str));
    }

    private static String reverseString(String x) {
        String tersiStr = "";
        for (int i = x.length()-1; i >=0 ; i--) {
            tersiStr +=x.charAt(i);
        }
        return tersiStr;
    }

}
