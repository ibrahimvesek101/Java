package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

        int arr[] = {1,2,3};
        int yeniArr[]=new int[arr.length];

        for (int i = 0; i < arr.length-1; i++) {
            yeniArr[i+1]=arr[i];
        }
        yeniArr[0]=arr[arr.length-1];
        System.out.println(Arrays.toString(yeniArr));
    }
}