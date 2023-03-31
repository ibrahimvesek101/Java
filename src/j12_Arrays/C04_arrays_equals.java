package j12_Arrays;

import java.util.Arrays;

public class C04_arrays_equals {
    public static void main(String[] args) {
        // Arrays eşitlik kontrolu... equals();-> methodu arrays elemanlarının hem index hem de value kontrolu yapar True/false return eder

        int arr1[] = {1, 2, 46, 79, 80, 21, 27, 44};
        int arr2[] = {21, 27, 46, 79, 44, 2, 1, 80};
        System.out.println("arr1, arr2 eşit mi : " + Arrays.equals(arr1, arr2));//false
        System.out.println("arr1[0]==arr2[6] = " + (arr1[0] == arr2[6]));//true
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("arr1, arr2 eşit mi : " + Arrays.equals(arr1, arr2));//True

        //Array'yi string'e convert(cevirme)...
      String str=  Arrays.toString(arr1);//arr1 int array String data type cevirildi
        System.out.println("str = " + str);//[1, 2, 21, 27, 44, 46, 79, 80]
        System.out.println("str.substring(3) = " + str.substring(3));// 2, 21, 27, 44, 46, 79, 80]
    }
}
