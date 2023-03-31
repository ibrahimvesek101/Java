package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task26 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou

        tekrarsizYaz();
    }

    private static void tekrarsizYaz() {

        System.out.print("Lütfen içinde bol tekrarlı harflerin olduğu bir metin giriniz : ");
        String metin = input.nextLine();
        String tekrarsiz = "";


        for (int i = 0; i < metin.length(); i++) {

            if (!tekrarsiz.contains("" + metin.charAt(i))) {

                tekrarsiz += "" + metin.charAt(i);
            }
        }
        System.out.println("Sade hali = "+(tekrarsiz));
    }
}
