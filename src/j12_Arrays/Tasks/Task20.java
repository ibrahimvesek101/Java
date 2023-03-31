package j12_Arrays.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};

        Scanner input = new Scanner(System.in);
        System.out.print("silmek istediğiniz sayıyı giriniz : ");
        int sayi = input.nextInt();

        sayiSil(arr, sayi);

    }

    private static void sayiSil(int[] arr, int sayi) {

        List<Integer> yeniList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=sayi) {
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}