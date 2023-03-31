package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane
        // character kullanildigini print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("lüfen bir cümle yazınız : ");
        String cumle = input.nextLine();

        System.out.println(cumle.replace(" ", "").length());

    }
}
