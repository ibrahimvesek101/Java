package Digerleri.interview.src.Day05;

import java.util.Arrays;

public class Q12_Printing2DArray {

        // Print 2D String array using loops


    public static void main(String[] args) {
        String [][] arr = {{"abc","def","ghi"}, {"jkl","mno","prs","aaa","bbb"}};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
