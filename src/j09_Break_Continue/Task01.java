package j09_Break_Continue;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        // girilen bir ifadedeki c karakterine kadar a karakter sayısını print ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("metin giriniz : ");
        String metin = input.nextLine();

        int aSayisi = 0;

        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == 'a') {
                aSayisi++;
            } else if (metin.charAt(i) == 'c') {
                break;
            }
        }
        System.out.println("Girdiğiniz metindeki 'c' karakterine\nkadar olan a sayısı = "+aSayisi);
    }
}
