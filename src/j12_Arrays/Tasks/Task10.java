package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int arr[] = {1, 2, -3, 4, -5, -6};
        arrTersIsaretle(arr);//[-1,-2, 3,-4, 5, 6]
        System.out.println("return type method : "+Arrays.toString(arrTersIsaretle1(arr)));//[-1,-2, 3,-4, 5, 6]
    }

    private static void arrTersIsaretle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//Arrays.toString(arr) = [-1, -2, 3, -4, 5, 6]

    }


    private static int[] arrTersIsaretle1(int[] ebıkGabık) {
        for (int i = 0; i < ebıkGabık.length; i++) {
            ebıkGabık[i] *=1;// arrTersIsaretle(arr)->method call edilirse arr - işaretleneceği için 1 ile çarpılmalı
        }

       return ebıkGabık;
    }
}
