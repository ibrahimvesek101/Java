package j07_StringManipulation;

import java.util.Scanner;

public class C05_Starts_EndsWith {
    public static void main(String[] args) {
        /*
          startsWith()
          Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
          String'in basladigi characteri dogrular
          endsWith()
          Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */


        String name = "Mustafa";
        System.out.println(name.startsWith("m"));//false
        System.out.println(name.startsWith("M"));//true
        // System.out.println(name.startsWith('M'));-> CTE  parametre char olmaz String olmalı
        System.out.println(name.startsWith("Mu"));//true

        System.out.println(name.endsWith("fa"));//true
        System.out.println(name.endsWith("a"));//true
        System.out.println(name.endsWith("x"));//false
        // System.out.println(name.endsWith('a'));> CTE  parametre char olmaz String olmalı

        String str = "ebikGabık";
        System.out.println(name.startsWith(str));//false
        System.out.println(str.endsWith(name));//false

        System.out.println(str.endsWith(str));//true
        System.out.println(name.startsWith(name));//true


        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.


        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen e-mail adresinizi giriniz : ");
        String mail = input.nextLine();

        if (mail.contains("@gmail.com")) {

            if (mail.contains("@gmail.com") && mail.endsWith("@gmail.com")) {
                System.out.println("Giriş onaylandı.");

            } else System.out.println("Geçerli hesap giriniz");

        } else System.out.println("lütfen gmail hesabınızı giriniz.");
    }
}