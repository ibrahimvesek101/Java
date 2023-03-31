package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kelime1 giriniz :");
        String kelime1 = input.nextLine();

        if(kelime1.length()%2==0){

            System.out.print("Lütfen kelime2 giriniz :");
            String kelime2 = input.nextLine();

            System.out.println(kelime1.substring(0,kelime1.length() / 2)+kelime2+kelime1.substring(kelime1.length() / 2));

        }else{
            System.out.println("Girdiğiniz kelimenin ortasına kelime eklenemez");
        }


    }
}
