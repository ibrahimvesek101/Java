package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task20 {
    /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78 ]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {

        StringtenParaCek();

    }

    private static void StringtenParaCek() {

        Scanner input = new Scanner(System.in);
        System.out.print("Metin içinde para birimlerini ve miktarlarını giriniz : ");
        String metin = input.nextLine();

        int dolar = 0;

        String euroStr = "";
        int euro = 0;


        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == '$') {

                String dolarStr = metin.substring(i + 1, metin.indexOf(' ', i + 1));

                int dolarInt = Integer.parseInt(dolarStr);

                dolar += dolarInt;
            }

        }
        System.out.println("Toplam dolar = " + dolar + " $");


        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == '€') {

                euroStr = metin.substring(i + 1, metin.indexOf(' ', i + 1));

                int euroInt = Integer.parseInt(euroStr);

                euro += euroInt;
            }

        }
        System.out.println("Toplam dolar = " + euro + " €");


    }

}
