package Digerleri.interview.src.Day05;

import java.util.Scanner;

public class Q08_UseContinue {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Text i giriniz : ");String text = scanner.nextLine();
        for (int i = 0; i <text.length() ; i++) {
   //         if(!(text.charAt(i)=='a' || text.charAt(i)==' ')) System.out.println(text.charAt(i));
            char ch=text.charAt(i);
            if(!(ch=='a' || ch==' ')) System.out.println(ch);
        }
    }

}
