package Digerleri.teamExtra;

import java.util.Scanner;

public class Q04_CountOfEnterCode {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız. ( 4 kez deneme hakkı olsun)

        String pin= "1234";
        int deneme =4;

        while (deneme>0){
            System.out.println("Lütfen şifrenizi yazınız");
            String input=scan.nextLine();
            if (input.equals(pin)){
                System.out.println("giriş başarılı");
                break;
            }else{
                deneme--;
                System.out.println("hatalı giriş!! " + deneme + " hakkınız kaldı" );
            }
        }
    }
}