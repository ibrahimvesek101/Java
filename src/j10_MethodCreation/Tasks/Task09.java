package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz


    */
        System.out.println("parametresiz :");
        saniyeyeCevir1();
        System.out.println("parametreli :");
        saniyeyeCevir2(4);
        System.out.println("return'lü :");
        System.out.println(saniyeyeCevir3(4));

    }

    private static int saniyeyeCevir3(int saat) {
        int saniye = saat * 60 * 60;
        return saniye;

    }

    private static void saniyeyeCevir2(int saat) {
        int saniye = saat * 60 * 60;
        System.out.println(saniye);
    }

    private static void saniyeyeCevir1() {
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen saat giriniz :");
        int saat = input.nextInt();

        int saniye = saat * 60 * 60;
        System.out.println(saniye);

    }

}
