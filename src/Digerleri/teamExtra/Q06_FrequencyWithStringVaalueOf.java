package Digerleri.teamExtra;

import java.util.Scanner;

public class Q06_FrequencyWithStringVaalueOf {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*
    Count the frequency of the letters in a given String as the format below:
    Input: String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */

        System.out.println("Lütfen bir cümle yazınız");
        String cümle= scan.nextLine();

        String bos="";
        int sayac =0;

        for (int i = 0; i < cümle.length(); i++) {
            sayac=0;
            for (int j = 0; j < cümle.length(); j++) {
                if(cümle.charAt(i)==cümle.charAt(j)){
                    sayac++;
                }
            }
            if (!bos.contains(cümle.substring(i,i+1))){
                bos+=cümle.substring(i,i+1)+sayac+" ";
            }
        }
        System.out.println("girilen ifadedeki harflerin tekrar sayısı = " + bos);

    }

}