package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("üçgen kenarlarını giriniz : ");

        int kenar1 = input.nextInt();
        int kenar2 = input.nextInt();
        int kenar3 = input.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("eşkenar");
        } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
            System.out.println("ikizkenar üçgen");
        } else {
            System.out.println("çeşitkenar üçgen");
        }

    }

}


