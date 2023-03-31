package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */
        Scanner input = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String isim = input.nextLine();

        String  sonuç=  isim.length()==3? (isim.charAt(0)!=isim.charAt(1)&&
                isim.charAt(0)!=isim.charAt(2)&&
                isim.charAt(1)!=isim.charAt(2)?"isim benzersiz harflerden oluşuyor":"isim benzersiz harflerden oluşmuuyor")
                : "isim 3 harf değil" ;
        System.out.println("sonuç = " + sonuç);
    }
}