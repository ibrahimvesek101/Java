package Digerleri.Elly_Code.src.lesson03;

import java.util.Scanner;

public class Q09_StringManipulation {
    /*
      Kullanicidan bir kelime girmesini isteyin.
      * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri yazdirin.
      */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kelime girinz :");
        String s = sc.nextLine();
        char ortancaKrk = s.charAt((s.length()-1)/2);
        if(s.length()%2 ==1  && s.length()>=3){
            System.out.println("ortancaKrk = " + ortancaKrk);
        }else
            System.out.println("tek sayida karakter iceren bir kelime giriniz..");
    }
}