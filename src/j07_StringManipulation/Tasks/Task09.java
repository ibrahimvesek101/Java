package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir yazi yaziniz :");

        String kelime = input.nextLine();

        if (kelime.length()%2==0){

        System.out.println(kelime.substring(0, kelime.length() / 2));


    }else System.out.println("lütfen çift sayılı bir metin giriniz.");
}}
