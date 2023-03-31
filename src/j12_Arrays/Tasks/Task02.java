package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        //task-> girilen int array elemanları toplamını print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Array uzunluğunu giriniz : ");

        int arr[] = new int[input.nextInt()];
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array'in " + (i + 1) + ". elemanını giriniz : ");
            arr[i] = input.nextInt();
            toplam+=arr[i];
        }

        System.out.println("Array = "+ Arrays.toString(arr));
        System.out.println("Array eleman toplamı = "+ toplam);

    }
}