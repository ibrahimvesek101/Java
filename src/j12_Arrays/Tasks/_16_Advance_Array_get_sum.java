package j12_Arrays.Tasks;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.
        int toplam = 0;
        String str = "$12 $23 $10 $2 $5 $2";
        str = str.replace("$", "");

        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            toplam += Integer.decode(arr[i]);
        }
        System.out.println(toplam);
    }
}