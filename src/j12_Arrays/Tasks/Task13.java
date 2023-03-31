package j12_Arrays.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */
        int sayac = 0;

        int arr[] = {2, 6, 4, 5, 8, 9,12};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                sayac++;
            }
        }
        System.out.println("Arrayinizde 3'e bölünebilen " + sayac+" sayı vardır.");
    }
}
