package Digerleri.teamExtra;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

          /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini(kaç adet olduğunu) ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

        System.out.println("Lütfen bir string ifade giriniz");
        String input = scan.nextLine();
        String output ="";
        int sayac=0;

        for (int i = 0; i < input.length(); i++) {
            sayac=0;
            for (int j = 0; j <input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)){
                    sayac++;
                }

            }
            if (!output.contains(input.substring(i,i+1))) {
                output+= input.substring(i,i+1) +"="+ sayac+ " ";
            }

        }
        System.out.println("girilen ifadedeki harflerin tekrar sayısı = " + output);
    }

}