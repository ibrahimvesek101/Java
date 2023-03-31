package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı , giriş sırasına göre
        // tersten print eden code create ediniz

        Scanner input = new Scanner(System.in);
        String arr[] = new String[5];

        for (int i = 0; i < arr.length ; i++) {
            System.out.print((i+1)+". elemanı giriniz : ");
            arr[i] = input.nextLine();
        }
        String arr1[]=new String[5];
        int a=0;
        for (int i = arr.length-1; i >=0; i--) {
            arr1[i]=arr[a];
            a++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
