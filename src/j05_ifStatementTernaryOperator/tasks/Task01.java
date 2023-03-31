package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz : ");
        int yas = input.nextInt();

        if (0 <= yas && yas <= 4) {
            System.out.println("bebek");
        } else if (5 <= yas && yas <= 12) {
            System.out.println("çocuk");
        } else if (13 <= yas && yas <= 20) {
            System.out.println("genç");
        } else if (21 <= yas && yas <= 30) {
            System.out.println("yetişkin");
        } else System.out.println("tanımlanmamış evre");
    }

}
