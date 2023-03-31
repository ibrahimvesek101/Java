package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden code create ediniz

		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner input = new Scanner(System.in);
        System.out.print("Parolanız;\n a)Ilk karakteri buyuk harf olmalı\n " +
                "b)Son karakteri sayi olamlı\n c)En az 6 karakter uzunlugunda olmalı\n" +
                "\n Lütfen parolanızı giriniz : ");

        String parola = input.nextLine();

        Character ilkHarf = parola.charAt(0);
        Character sonHarf = parola.charAt(parola.length() - 1);


        Boolean a = Character.isUpperCase(ilkHarf);
        Boolean b = Character.isDigit(sonHarf);
        Boolean c= parola.length()>=6;

        if(a==true && b==true && c==true){
            System.out.println("Tebrikler! Giriş başarılı.");

        }else System.out.println("Lütfen tekrar deneyin");
    }
}
