package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Task-> girilen bir int array elemanlarını buyukten kucuge print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Array uzunluğunu giriniz : ");

        int arr[] = new int[input.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array'in " + (i + 1) + ". elemanını giriniz : ");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}