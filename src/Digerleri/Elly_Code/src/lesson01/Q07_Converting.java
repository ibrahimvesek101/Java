package Digerleri.Elly_Code.src.lesson01;

import java.util.Scanner;

public class Q07_Converting {

        //  Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın. (Scanner class)
        //  formül
        //  c = (f-32)*5/9

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("fahrenayt degerini giriniz :");
        int  f = scan.nextInt();
        System.out.println("girdiginiz fahrenayt degerinin santigrda derecesi :" + (f-32)*5/9);
    }

    

}
