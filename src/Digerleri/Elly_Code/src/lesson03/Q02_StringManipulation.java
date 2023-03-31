package Digerleri.Elly_Code.src.lesson03;
import java.util.Scanner;
public class Q02_StringManipulation {


    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String 1:");
        String str1 = scan.next();
        System.out.print("String 2:");
        String str2 = scan.next();
        System.out.println("1.method :" + str1 + " " + str2);
        System.out.println("2.method :" + str1.concat(" " + str2));
        System.out.println("birlesim : "+ str1.substring(1) + " " + str2.substring(1));
    }
}