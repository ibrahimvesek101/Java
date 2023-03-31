package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir karakter giriniz : ");

        char ch = input.nextLine().charAt(0);

        if (Character.isAlphabetic(ch) && Character.isUpperCase(ch)) {
            System.out.println("büyük harf");

        } else if (Character.isAlphabetic(ch) && Character.isLowerCase(ch)) {
            System.out.println("küçük harf");

        } else System.out.println("harf değil");







		/*
		 Logical Operator (Mantik Islemleri)
		 1) And Islemi : Sembolu & veya && dir.&& sembolu daha hizli calisir.Bu yuzden genellikle && kullaniriz
		 						true && true = true
		 						true && false = false
		 						false && true = false
		 						false && false = false
		 2)Or Islemi : Sembolu || dir
		 						true || false = true
		 						true || true = true
		 						false || true = true
		 						false || false = false
		 3)Not Islemi : Sembolu !'dir
		 						!true = false
		 						!false = true
		 						
		 						
		 */






    }

}
