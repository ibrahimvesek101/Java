package A_Deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Deneme {


    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 22, 23, 85, 58, 1, 77, 66, 22, 23, 2, 2, 2, 77};
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Aranilan sayiyi giriniz :");
        int sayi = scan.nextInt();


            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == sayi) {
                    counter++;
                }
            }
            if (counter ==0){
                System.out.println("Listede "+sayi+" sayısı bulunamamıştır.");
            }else {
            System.out.println(sayi + " sayısı " + counter + " kadar geçmektedir.");
        }

    }
}
