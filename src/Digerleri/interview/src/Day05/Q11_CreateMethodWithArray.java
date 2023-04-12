package Digerleri.interview.src.Day05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Q11_CreateMethodWithArray {
    /*
            ||This Part Should be in Main Method||

             -Create an array of size 5, assign some random values from 0 to 10
             -(use random class and for loop to assign values)


            ||You should create public static void methods fori loop
            (Parameter should be int Array for methods)||

             -1-Create a method that prints array like "2 3 1 10 2",
             space between elements of array
             -2-Create a method that prints the sum of an array
             -3-Create a method that prints the max element of an array

            P.S: Return type should be void because we are not returning anything just printing
    */
    public static void main(String[] args) {
        int [] arr = new int[5];
        createArray(arr);
        printArray(arr);
        sumArray(arr);
        maxArray(arr);
    }
    private static void maxArray(int[] arr) {
        int max=arr[0];
        for (int each:arr ) {
            if (each>max) max=each;
        }
        System.out.println("Max of Array : "+max);
    }

    private static void sumArray(int[] arr) {
        int sum=0;
        for (int each:arr ) {
            sum += each;
        }
        System.out.println("Sum of Array : "+sum);
    }

    private static void printArray(int[] arr) {
        for (int each:arr ) {
            System.out.print(each+" " );
        }
        System.out.println();
    }

    private static void createArray(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = rnd.nextInt(11);
        }
    }



}
