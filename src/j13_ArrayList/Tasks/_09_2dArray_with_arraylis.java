package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14}};

        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sayac++;
            }
        }

        int arr1[] = new int[sayac];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr1[index] = arr[i][j];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}