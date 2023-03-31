package j12_Arrays.Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        int sayi = 123;
        String str = String.valueOf(sayi);
        String arr[] = str.split("");

        int uzunluk = arr.length;
        String yeniArr[] = new String[uzunluk];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[uzunluk - i - 1] = arr[i];
        }
        String yeniStr = Arrays.toString(yeniArr);
        System.out.println(yeniStr.replace("[", "").replace("]", "").replaceAll(",", "").replaceAll(" ", ""));

    }
}



