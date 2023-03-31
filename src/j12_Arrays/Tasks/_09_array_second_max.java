package j12_Arrays.Tasks;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..
        int arr[] = {15, 25, 22, 18, 30};

        int uzunluk = arr.length;

        Arrays.sort(arr);
        System.out.println("düz arr");
        System.out.println(Arrays.toString(arr));

        int arrTers[] = new int[uzunluk];
        for (int i =0 ;i <arr.length; i++) {

            arrTers[uzunluk-i-1] = arr[i];
        }
        System.out.println("en büyük 2. elemanı = "+arrTers[1]);

    }
}
