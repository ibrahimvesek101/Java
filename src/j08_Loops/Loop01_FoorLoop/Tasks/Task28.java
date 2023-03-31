package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        // task-> girilen  bir char karakterden sonra gelen 10 karakteri prin eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {

            System.out.print((char) (girilenKarakter+i) + " ");
        }
    }
}
