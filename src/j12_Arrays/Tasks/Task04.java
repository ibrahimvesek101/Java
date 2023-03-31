package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.print("Array uzunluğunu giriniz : ");

        int arr[] = new int[input.nextInt()];
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array'in " + (i + 1) + ". elemanını giriniz : ");
            arr[i] = input.nextInt();
            toplam += arr[i];
        }
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("Array eleman toplamı = " + toplam);
        System.out.println("ortalama = " + (toplam / arr.length));
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > (toplam / arr.length)) {

                sayac++;
            }
        }
        int ortUstuİndex=0;

        int arrBuyuk[]=new int[sayac];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > (toplam / arr.length)) {
                arrBuyuk[ortUstuİndex]=arr[i];
                ortUstuİndex++;
            }
        }
        System.out.println("Oratalamayı geçen "+sayac+" sayı vardır.");
        System.out.println("ortalama üstü elemanlar listesi = "+Arrays.toString(arrBuyuk));
    }
}