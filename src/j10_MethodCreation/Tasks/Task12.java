package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */
        meyılKontrol1();
        System.out.println(" 1. method run oldu ");
        meyılKontrol2("ebıkGabık@gmail.com");
        System.out.println(" 2. method run oldu ");
        System.out.println(meyılKontrol3());
        System.out.println(" 3. method run oldu ");

    }//main sonu

    private static String meyılKontrol3() {
        System.out.print("imeyıl  giriniz : ");
        String imeyıl = input.nextLine();
        return (imeyıl.contains("@") && imeyıl.contains(".") && imeyıl.charAt(0) != '@') ? "imeyıl BAŞARILI" : "bizimle DEĞILSIN";

    }

    private static void meyılKontrol2(String imeyıl) {
        System.out.println((imeyıl.contains("@") && imeyıl.contains(".") && imeyıl.charAt(0) != '@') ? "imeyıl BAŞARILI" : "bizimle DEĞILSIN");
    }

    private static void meyılKontrol1() {

        System.out.print("email giriniz : ");
        String imeyıl = input.nextLine();
        System.out.println((imeyıl.contains("@") && imeyıl.contains(".") && imeyıl.charAt(0) != '@') ? "imeyıl BAŞARILI" : "bizimle DEĞILSIN");
    }


}







