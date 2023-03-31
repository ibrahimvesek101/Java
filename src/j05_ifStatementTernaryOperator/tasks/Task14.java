package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */

        Scanner input = new Scanner(System.in);

        System.out.println("agam cinsiyet  giresen : ");
        String cns = input.next();

        // System.out.println("agam yasini  giresen : ");
        // int yas = input.nextInt();
        //
        // System.out.println("agam prim günü  giresen : ");
        // int prim = input.nextInt();

        if (cns.equals("kadın")) {//cinsiyet kadın şartı
            System.out.println("hanımagam yasini  giresen : ");
            int yas = input.nextInt();
            if (yas > 60) {//kadın yaşı 60 dan büyük şartı
                System.out.println("hanımagam prim günü  giresen : ");
                int prim = input.nextInt();
                if (prim > 6000) {//prim gun sayısı 6000 den buyuk şartı
                    System.out.println("tebrikler NENEM nerde yedin  emekli paraları söyle :)");
                } else System.out.println("hanımagam emekliliğe daha " + (6000 - prim) + "  priminiz eksik");

            } else System.out.println("hanımagam emekliliğe daha " + (60 - yas) + " yılınız var");


        } else if (cns.equals("erkek")) {//cinsiyet erkek şartı
            System.out.println("agam yasini  giresen : ");
            int yas = input.nextInt();
            if (yas > 65) {//erkek yaşı 65 dan büyük şartı

                System.out.println("agam prim günü  giresen : ");
                int prim = input.nextInt();
                if (prim > 7000) {//prim gun sayısı 7000 den buyuk şartı
                    System.out.println("tebrikler DEDEM nerde yedin  emekli paraları söyle :)");
                } else System.out.println("agam emekliliğe daha " + (7000 - prim) + "  priminiz eksik");

            } else System.out.println("agam emekliliğe daha " + (65 - yas) + " yılınız var");
        } else System.out.println("lüften cinsiyeti doğru giriniz ");

    }
}