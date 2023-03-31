package Digerleri.teamExtra;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Q07_IsDigit {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /* Create a method that accepts a String as parameter and finds the sum of digits in that String.
    Example:
    input : J4\/4 1$ 34$¥
    output : 16

    Hint:
    Character.isDigit()
    Integer.valueOf()
   */
        System.out.println("Lütfen içerisinde sayı bulunan bir cümle giriniz. ");
        String input = scan.nextLine();


        int toplam=0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                toplam+= Integer.parseInt(input.substring(i, i+1));
            }
        }
        System.out.println("toplam = " + toplam);
    }
}