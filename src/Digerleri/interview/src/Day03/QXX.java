package Digerleri.interview.src.Day03;

public class QXX {
    public static void main(String[] args) {
        int [][] array = new int[5][2];
        array [1] = new int[10];
        int [][] array2 = new int[][] {{3,4,5,6,7},{2,3}};

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < array2.length ; i++) {
            for (int j = 0; j <array2[i].length ; j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
