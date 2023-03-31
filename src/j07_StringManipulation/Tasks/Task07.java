package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki
        karakteri print eden code create ediniz
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir metin giriniz : ");
        String kelime = input.next();

        System.out.print("Lütfen yazdırmak istediğiniz karakter indexini giriniz : ");
        System.out.println(kelime.charAt(input.nextInt()));


    }
}
