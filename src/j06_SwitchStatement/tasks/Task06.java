package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		//Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz

		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen VIP kısaltmasında anlamını öğrenmek istediğiniz harfi giriniz : ");

		String harf= input.nextLine().toLowerCase();

		switch (harf){
			case ("v"):
				System.out.println("Very");
				break;
			case ("ı"):
				System.out.println("Important");
				break;
			case ("p"):
				System.out.println("Person");
				break;
			default:
				System.out.println("Yanlış giriş yaptınız");
				break;

		}



	}
}
