package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task02_ÖğrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner input = new Scanner(System.in);
        System.out.print("kaç adet not gireceksiniz ? ");
        int sayi = input.nextInt();
        int toplam=0;
        int ortalama = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ". notu giriniz : ");
            int not = input.nextInt();
            list.add(not);
            toplam+=not;
        }
        ortalama=toplam/sayi;
        int sayac=0;
        for (int i = 0; i < list.size(); i++) {
        if (list.get(i)>ortalama) {
            sayac++;
        }
        }
        System.out.println("not ortalaması = "+ortalama);
        System.out.println("ortalamayı geçen " +sayac+ " tane öğrenci vardır.");
    }
}
