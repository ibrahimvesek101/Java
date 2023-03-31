package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı prnt eden code create ediniz
       */
        System.out.print("Lütfen adınızı ve soyadınızı yazınız :");

        Scanner input = new Scanner(System.in);

        String adiSoyadi = input.nextLine();

        System.out.println(adiSoyadi.substring(0, adiSoyadi.indexOf(" ")));
        System.out.println(adiSoyadi.substring(adiSoyadi.indexOf(" ") + 1));


    }
}
