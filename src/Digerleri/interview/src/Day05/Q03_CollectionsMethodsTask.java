package Digerleri.interview.src.Day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q03_CollectionsMethodsTask {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 yer sağa döndür ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print((i+1)+". Sayi giriniz : ");
            arrList.add(scan.nextInt());
            System.out.println();
        }

        Collections.sort(arrList,Collections.reverseOrder());
        System.out.println(arrList);
        Collections.shuffle(arrList);
        System.out.println(arrList);
        Collections.rotate(arrList,3);
        System.out.println(arrList);
        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        Collections.replaceAll(arrList,max,min);
        System.out.println(arrList);

    }

}
