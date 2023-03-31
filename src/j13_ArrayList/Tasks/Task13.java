package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};

        ardısıkTopla(arr);

    }

    private static void ardısıkTopla(int[] arr) {

        int baslangıc = 0;
        int sayi = 1;

        ArrayList<Integer> list = new ArrayList<>();
        while ((sayi + baslangıc) <= arr.length) {

            int toplam = 0;

            for (int i = baslangıc; i < sayi + baslangıc; i++) {

                toplam += arr[i];
            }
                list.add(toplam);
                baslangıc+=sayi;
                sayi++;
            }
        System.out.println(list);
    }
}

