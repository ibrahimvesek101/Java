package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın
        // tek elemanlarını print eden code create ediniz.

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }


    }
}
