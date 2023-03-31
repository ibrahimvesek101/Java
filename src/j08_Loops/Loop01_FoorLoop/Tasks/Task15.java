package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */


        Scanner input = new Scanner(System.in);

        System.out.print("metin giriniz : ");

        String kelime = input.nextLine();


        for (int i = 0; i <kelime.length(); i++) {

            Character karakter = kelime.charAt(i);

            if (Character.isDigit(karakter)||karakter==',') {

				System.out.print(karakter);

			}}
        }
    }

