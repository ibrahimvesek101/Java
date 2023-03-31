package Day04;

import java.util.ArrayList;
import java.util.Scanner;

public class Q06_CountsOfRepeatingElement {
    /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */

    public static void main(String[] args) {
        int arr [] = {1,1,1,1,22,23,85,58,1,77,66,22,23,2,2,2,77};
        int counter=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Aranilan sayiyi giriniz :");
        int sayi = scan.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            if (sayi == arr[i]) counter++;
        }
        System.out.println("aranilan sayi :"+sayi + "\ntekrar sayisi da :" + counter);
        //  sorunun çözümü üstte, altta ise tüm tekrar edenleri bulmak için
        metot(arr);
    }

    private static void metot(int[] arr) {
        String st="";
        String stDizi=",";
        for (int i = 0; i <arr.length ; i++) {
            int ilkEleman=arr[i];
            int count=0;

            for (int j = i; j <arr.length ; j++) {
                if (arr[j]==ilkEleman) {
                    count++;
                 }
            }
            if (count>1) {
                st=""+ilkEleman+",";
                if (!stDizi.contains(","+st)) {
                    System.out.println(ilkEleman+"  " + count);
                    stDizi = stDizi+st;
// stDizinin içerisinde hepsini virgül ile ayrarak 1 ila içinde 1 geçen
// daha büyük bir sayının karışmasını engellemiş olduk.
                }

            }

        }

    }
}
