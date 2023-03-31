package Digerleri.CananHoca.Projeler.P01_ArrayList_Proje;

import java.util.ArrayList;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like
     * {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     *
     * input: { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * {3, 5+1, 2+7+9, 2+3+5+7}
     * output: (3,5,18,17)
     */
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        // 3, 5+1, 2+7+9, 2+3+5+7
        ardisikTopla(arr);
    }
    private static void ardisikTopla(int[] arr) {
        int baslangic=0;
        int sayi=1;
        ArrayList<Integer> list= new ArrayList<>();
        while ((sayi+baslangic)<=arr.length) {
            int toplam=0;
            // {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
            for (int i = baslangic; i < sayi+baslangic; i++) {
                // i=0/ 1, 2 / 2, 3, 4
                toplam+=arr[i]; // 3/ 5+1 / 7+9+2
            }
            list.add(toplam); //(3, 6
            baslangic+=sayi; // baslangic= 1/ 3
            sayi++; // sayi = 2 /3
        }
        System.out.println(list);
    }
}

