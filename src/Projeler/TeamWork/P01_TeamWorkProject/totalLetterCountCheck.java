package Projeler.TeamWork.P01_TeamWorkProject;

import java.util.Scanner;

public class totalLetterCountCheck {

    /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false

     */

    /*
     Girilen bir string ifadenin harf saysının tek olmasını kontrol eden code create ediniz.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        //  code Start here don't change before this line
        // bu satırdan önceki kodları değiştirmeyiniz

       if (word.length()%2==1){
           System.out.println("true");
       }else {
           System.out.println("false");
       }
    }
}
