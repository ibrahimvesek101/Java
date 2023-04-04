package Projeler.TeamWork.P03_TeamWorkProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CamelCase {

    /*
     TASK ->
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin sadece ilk karakterlerini
            büyük harfe çevirip return eden  method create ediniz.
            input: I lIVe in uSa
            output: I Live In Usa

     */
  static   Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(camelcase());

    }

    public static String camelcase() {

        System.out.println("Lütfen bir cümle yazınız");

        String x = scan.nextLine();
        String cap = "";
        int i = 0;
        while (i < x.length()) {
            if (i == 0) {
                cap += capitalize(x.substring(i, i + 1));
                i++;
            } else if (x.charAt(i) == ' ') {
                cap += capitalize(x.substring(i, i + 2));
                i += 2;
            } else {
                cap += x.charAt(i);
                i++;
            }
        }return cap;

    }

    public static String capitalize(String s) {
        // senin yazdigin capitalize fonksiyonu
        if(s.length() == 1){
            return s.toUpperCase(Locale.forLanguageTag("tr"));
        }
        return s.charAt(0) + s.substring(1).toUpperCase(Locale.forLanguageTag("tr"));
    }
}