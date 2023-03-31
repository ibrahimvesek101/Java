package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class Ternary_nested {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir harf giriniz :");

        char harf = input.next().charAt(0);

       String harfDurum= (Character.isLowerCase(harf))?"küçük harf":(Character.isUpperCase(harf))?"büyük harf":"girdiğiniz karakter harf değil";

        System.out.println(harfDurum);



    }
}
