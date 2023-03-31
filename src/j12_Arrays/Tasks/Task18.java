package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}
        int arr[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};


        int yeniArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                yeniArr[i] += arr[i][j];
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }}
