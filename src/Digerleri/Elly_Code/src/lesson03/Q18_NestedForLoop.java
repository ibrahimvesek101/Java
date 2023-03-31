package Digerleri.Elly_Code.src.lesson03;

import java.util.Scanner;

public class Q18_NestedForLoop {
    /*
        Get the number of rows and columns from user.
        Create a rectangle.
        rows = 3 and column = 5 ==> * * * * *
                                    * * * * *
                                    * * * * *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("satir sayisi : "); int satir = sc.nextInt();
        System.out.println("sutun sayisi : "); int sutun = sc.nextInt();
        for (int i = 1; i <=satir ; i++) { //satir kontrolu- outer for loop
            for (int j = 1; j <=sutun ; j++) { //sutun kontrolu- inner for loop
                System.out.print("* ");
            }
            System.out.println(); //dummy5


        }
    }
}



