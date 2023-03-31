package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("\nlütfen bir harf giriniz : ");

        String kelime = scan.nextLine();
        char harf = kelime.charAt(0);

        if (Character.isLowerCase(harf)) {
            if (harf == 'a') {
                System.out.println("İlk küçük harf");
            } else System.out.println("ilk küçük harf değil");
        } else if (Character.isUpperCase(harf)) {
            if (harf == 'Z') {
                System.out.println("Son büyük harf");
            } else System.out.println("Son büyük harf değil");

        }else {
            System.out.println("girdiğiniz karakter harf değil");
        }

    }

}
