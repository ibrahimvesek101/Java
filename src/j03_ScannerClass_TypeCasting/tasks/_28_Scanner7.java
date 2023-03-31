package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.
        boolean hesap;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Banka Hesabınızvar mı? : ");
        hesap = scanner.nextBoolean();
        System.out.println(hesap);
    }
}
