package j12_Arrays;

import java.util.Arrays;

public class C03_Arrays_split {
    public static void main(String[] args) {
        //String data Array' ecevirmek için ..split()-> girilen parametre değere göre string prçalanır

        String str = "javaCAN'lara selam olsun";
        System.out.println("str = " + str);//javaCAN'lara selam olsun

        String arr[] = str.split("");//str hiçliğe göre parçalanıp her bir parca arr'e atandı
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//[j, a, v, a, C, A, N, ', l, a, r, a,  , s, e, l, a, m,  , o, l, s, u, n]
        System.out.println("arr.length = " + arr.length);//24
        String arr1[] = str.split(" ");//str space göre parçalanıp her bir kelime arr'e atandı

        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));//[javaCAN'lara, selam, olsun]
        System.out.println("arr1.length = " + arr1.length);//3

    }
}
