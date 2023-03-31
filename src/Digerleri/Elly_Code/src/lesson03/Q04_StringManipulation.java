package Digerleri.Elly_Code.src.lesson03;

import java.util.Scanner;

public class Q04_StringManipulation {
    /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ece
     * output = cecece
     *
     * input = el
     * output = el
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("bir string giriniz :");
        String str = sc.next();
        String sonIkiHarf = str.substring(str.length()-2);
        if(str.length()>=3) System.out.println(sonIkiHarf + sonIkiHarf +sonIkiHarf);
        else System.out.println(str);
    }
}