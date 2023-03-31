package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int toplam=0;

        for (int i = 1; i <= 3; i++) {
            System.out.print(i + ".ci sayıyı giriniz :");
            toplam +=input.nextInt();

        }
     //   System.out.println(ortalama(toplam, finalNotu));
    }

    private static double ortalama(double a, int finalNotu) {
        return a/3;


}
}