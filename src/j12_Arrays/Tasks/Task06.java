package j12_Arrays.Tasks;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını
        // buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8,9,10};

        System.out.println(buyuktenKucugeSirala(arr));

    }

    private static String buyuktenKucugeSirala(int arr1[]) {
        Arrays.sort(arr1);
        int a=0;
        String arr2[] = new String[arr1.length];
        for (int i = arr1.length-1; i >=0 ; i--) {
            arr2[a]= String.valueOf(arr1[i]);
            a++;
        }

    return Arrays.toString(arr2);
    }
}
