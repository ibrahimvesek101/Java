package j10_MethodCreation.Tasks;


import java.util.Scanner;

public class Task08 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */       Scanner input = new Scanner(System.in);
        System.out.print("Artık yıl sorgusunu yapacağınız yılı giriniz : ");
        int yil = input.nextInt();

        System.out.println(artikYilHesapla(yil));


    }

    private static String artikYilHesapla(int yil) {

    return (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0) ? "Girilen yıl ARTIK YIL'dır" : "Girilen yıl ARTIK YIL değildir..");
    }
}
