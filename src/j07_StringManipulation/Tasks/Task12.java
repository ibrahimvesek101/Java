package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */

        System.out.print("Lütfen adınızı, soyadınızı ve mesleğinizi yazınız :");

        Scanner input = new Scanner(System.in);

        String adiSoyMes = input.nextLine();

        String kelime1 = adiSoyMes.substring(0, adiSoyMes.indexOf(" "));
        String kalanKelimeler1 = adiSoyMes.substring(adiSoyMes.indexOf(" ") + 1);
        String kelime2 = kalanKelimeler1.substring(0, kalanKelimeler1.indexOf(" "));

        String kelime3 = kalanKelimeler1.substring(kalanKelimeler1.indexOf(" ")+1);

        System.out.println(kelime1.charAt(0) + "." + kelime2.charAt(0) + "." + kelime3.charAt(0) + ".");


    }
}
