package j12_Arrays;

import java.util.Arrays;

public class C05_Arrays_copyOf {
    public static void main(String[] args) {
        //Array kopyalama...copyOf();->girilen arr'in newLength ekadar ilk elemanını kopyalar

        int arr[] = {1, 2, 46, 79, 80, 21, 27, 44};
        int[] arr2 = Arrays.copyOf(arr, 3);//[1,2,46]

        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));//[1, 2, 46]

        //task-> arr'nin son  3 elemanını atandığı arrayi print eden code create ediniz.
        int arr3[]=Arrays.copyOfRange(arr,arr.length-3,arr.length);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));//[21,27,44]

        //Array belirli bir eleman ile set(update) etme... fill(arr,value)-> girilen arr istenen value ile tüm elemanlar update edilir
        Arrays.fill(arr,58);//arr tüm elemanlar 58 ile update edildi

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//[58,58...]

        Arrays.fill(arr,arr.length-3,arr.length,63);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//[58,58...63,63,63]

    }
}
