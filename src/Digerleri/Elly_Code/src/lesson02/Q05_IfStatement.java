package Digerleri.Elly_Code.src.lesson02;

import java.util.Scanner;

public class Q05_IfStatement {

    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen Y/N ikilisinden birini giriniz :");
        char karakter = sc.next().charAt(0); //tek karakteri garantiledik
        if(karakter == 'Y'  || karakter == 'y'){
            System.out.println("YES");
        }else if(karakter == 'N'  || karakter == 'n'){
            System.out.println("NO");
        }else System.out.println("yanlis giris yaptiniz..\ntekrar deneyiniz");

    }



}
