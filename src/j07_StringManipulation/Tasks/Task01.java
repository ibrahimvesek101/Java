package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        // Task->  Girilen  bir stringde boşluk karakterinin
        // olup olmadığını kontrol eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.print("lütfen birşeyler yazınız boşluk olup olmadığını kontrol edeceğiz :");

        String yazi = input.nextLine();

        System.out.println(yazi.contains(" "));


    }
}

