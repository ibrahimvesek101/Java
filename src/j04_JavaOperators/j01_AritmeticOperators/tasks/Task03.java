package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Task->
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int i = scan.nextInt();

		int ilk = i/100;
		int son = i%10;

		System.out.println(ilk+son);
		
	}

}
