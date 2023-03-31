package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task11 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz

        a->7
        v->1
        c->-4
        e->2
         */

        hackerDilPrintEt();

        System.out.println("1. method run oldu ");

        System.out.println(hackerDilPrintEt1("başarı gayrete aşıktır :) "));

        System.out.println("2. method run oldu ");


    }//main sonu

    private static String hackerDilPrintEt1(String goygoy) {
        return goygoy.replace("a", "7").replace("v", "1").replace("c", "-4").replace("e", "2");


    }

    private static void hackerDilPrintEt() {
        System.out.print("bizim ooolan bişeyle gir bakennn : ");
        String str = input.nextLine();
        System.out.println(str.replaceAll("a", "7").replaceAll("v", "1").replaceAll("c", "-4").replaceAll("e", "2"));
    }


}