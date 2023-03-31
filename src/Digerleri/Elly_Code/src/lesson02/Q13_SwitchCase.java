package Digerleri.Elly_Code.src.lesson02;

import java.util.Scanner;

public class Q13_SwitchCase {


    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 basamakli pozitif bir sayi giriniz :");
        int sayi = scanner.nextInt();

        int yuzlerBas = sayi/100,  onlarBas = (sayi/10)%10, birlerBas = sayi%10;

        if(sayi>99 && sayi<1000) {
            switch (yuzlerBas){
                case 1 : System.out.println("yuz"); break;
                case 2 : System.out.println("ikiyuz"); break;
                case 3 : System.out.println("ucyuz"); break;
                case 4 : System.out.println("dortyuz"); break;
                case 5 : System.out.println("besyuz"); break;
                case 6 : System.out.println("altiyuz"); break;
                case 7 : System.out.println("yediyuz"); break;
                case 8 : System.out.println("sekizyuz"); break;
                case 9 : System.out.println("dokuzyuz"); break;
            }switch (onlarBas){
                case 1 : System.out.println("on"); break;
                case 2 : System.out.println("yirmi"); break;
                case 3 : System.out.println("otuz"); break;
                case 4 : System.out.println("kirk"); break;
                case 5 : System.out.println("elli"); break;
                case 6 : System.out.println("altmis"); break;
                case 7 : System.out.println("yetmis"); break;
                case 8 : System.out.println("seksen"); break;
                case 9 : System.out.println("doksan"); break;
            }switch (birlerBas){
                case 1 : System.out.println("bir"); break;
                case 2 : System.out.println("iki"); break;
                case 3 : System.out.println("uc"); break;
                case 4 : System.out.println("dort"); break;
                case 5 : System.out.println("bes"); break;
                case 6 : System.out.println("alti"); break;
                case 7 : System.out.println("yedi"); break;
                case 8 : System.out.println("sekiz"); break;
                case 9 : System.out.println("dokuz"); break;
            }
        }else System.out.println("lutfen 3 basamakli pozitif bir sayi giriniz");

    }

}