package Projeler.TeamWork.P01_TeamWorkProject;

import java.util.Scanner;

public class checkNumberEven {

    /*
        Given an int check the number is even or not

        if the number is even print true

        if the number is odd print false

        result should be true or false.

     */


     /*
        int data type number verildiğinde, number  çift-tek kontrol eden code create ediniz

        Eğer number çift ise  print true

        Eğer number tek ise  print false



     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz : ");
        int number = scanner.nextInt();

        //  code Start here don't change before this line
        //bu satırdan önceki kodlari değiştirmeyiniz

        if(number%2==0){
            System.out.println("true");
        }else {
            System.out.println("false");

        }

    }

}
