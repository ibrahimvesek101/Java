package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir metin giriniz : ");
        String kelime = input.next();

        System.out.println(kelime.substring(0, kelime.length() - 1));


    }
}
