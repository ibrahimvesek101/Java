package j09_Break_Continue;

import java.util.Scanner;

public class C02_Contiune {
    public static void main(String[] args) {


        // girilen metinde boşlukları atla ve yaz.

        Scanner input= new Scanner(System.in);
        System.out.print("metin giriniz : ");
        String metin = input.nextLine();

        for (int i = 0; i <metin.length() ; i++) {
            if (metin.charAt(i) == ' '){
                continue;
            }else System.out.print(metin.charAt(i));
        }
}}
