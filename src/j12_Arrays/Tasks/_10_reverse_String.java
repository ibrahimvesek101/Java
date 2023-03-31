package j12_Arrays.Tasks;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String str = "Hello World";

        String arrStr[] = str.split("");
        System.out.println("Str arr ye atıldı");
        System.out.println(Arrays.toString(arrStr));
        int uzunluk = arrStr.length;

        String tersArr[] = new String[uzunluk];

        for (int i = 0; i < arrStr.length; i++) {
            tersArr[uzunluk - i - 1] = arrStr[i];
        }
        System.out.println("arr tersine çevrildi.");
        System.out.println(Arrays.toString(tersArr));

        System.out.println("arr str ye atıldı");
        String tersStr = Arrays.toString(tersArr);
        System.out.println(tersStr.replace("[", "").replace("]", "").replaceAll(",", ""));

    }
}