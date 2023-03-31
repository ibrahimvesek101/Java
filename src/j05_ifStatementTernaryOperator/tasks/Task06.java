package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen cinsiyetinizi yazınız : ");
        String cinsiyet = scan.nextLine();

        System.out.println("lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();


        if (cinsiyet.equals("erkek")) {

            if (yas < 18) {
                System.out.println("erkek çocuk");
            } else {
                System.out.println("yetişkin erkek");
            }
        } else {
            if (yas < 18) {
                System.out.println("kız çocoğu");
            } else {
                System.out.println("kadın");
            }
        }
    }
}