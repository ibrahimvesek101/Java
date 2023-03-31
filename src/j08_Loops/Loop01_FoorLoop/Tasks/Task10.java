package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */

        Scanner input= new Scanner(System.in);

        System.out.print("Bir cümle giriniz giriniz : ");

        String kelime = input.nextLine();

        System.out.print("Saydırmak istediğiniz harfi giriniz : ");

        Character harf = input.next().charAt(0);

        int harfSayisi= 0;

        for (int i = 0; i <=kelime.length()-1 ; i++) {

            if(kelime.charAt(i) ==harf){
                harfSayisi++;

            }

        }
        System.out.println("Girdiğiniz "+"'"+kelime+ "'" +" metninde istediğin "+"'" +harf+"'" + " harf sayısı =" +harfSayisi );
    }
}
