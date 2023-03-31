package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = input.nextInt();
        String strSayi = Integer.toString(sayi);

        String arr[] = strSayi.split("");
        Arrays.sort(arr);
        String yeniArr[] = new String[strSayi.length()];
int a = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            yeniArr[a] = arr[i];
        a++;
        }
        String yeniStr = Arrays.toString(yeniArr);
        System.out.println(yeniStr.
                replaceAll(",", "").
                replace("[","").
                replace("]", "").
                replaceAll(" ", ""));

    }
}


