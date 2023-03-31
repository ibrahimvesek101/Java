package j12_Arrays;

import java.util.Arrays;

public class C02_Arrays_binarySearch {
    public static void main(String[] args) {
        // array'de eleman kontrolu

        int sayiArray[] = {2, 46, 31, 80, 44, 63, 27, 21, 79};

        int sayi1 = 44;
        int sayi2 = 34;
        boolean flag = false;// bayrak aşağı
        for (int i = 0; i < sayiArray.length; i++) {
            if (sayi2 == sayiArray[i]) {
                flag = true;//bayrak yukarı
                break;
            }
        }
        if (flag) {
            System.out.println("aranan sayi arrayda mevcut");
        } else System.out.println("aranan sayi arrayda mevcut değil ");

        Arrays.sort(sayiArray);//sortingen

        System.out.println("Arrays.binarySearch(sayiArray,34) = " + Arrays.binarySearch(sayiArray, 34));
        System.out.println("Arrays.binarySearch(sayiArray,35) = " + Arrays.binarySearch(sayiArray, 35));
        System.out.println("Arrays.binarySearch(sayiArray,44) = " + Arrays.binarySearch(sayiArray, 44));
        System.out.println("Arrays.binarySearch(sayiArray,31) = " + Arrays.binarySearch(sayiArray, 31));
    }
}
