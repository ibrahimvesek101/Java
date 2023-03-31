package Digerleri.CananHoca.ArrayListCozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        // Verilen bir listede, istenen iki index'deki elementlerin yerini
        // kalici olarak degistiren bir method olusturun
        // liste: 1, 3, 5, 6, 7
        // ilk index= 2, ikinci index=3
        // yeni liste output: 1, 3, 6, 5, 7

        ArrayList<Integer> sayilar= new ArrayList<>(Arrays.asList(1, 3, 5, 6, 7));
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk indexi girin");
        int ilkIndex= scan.nextInt();

        System.out.println("ikinci indexi girin");
        int ikinciIndex= scan.nextInt();

        elemanlariDegistir(sayilar,ilkIndex,ikinciIndex);

        sayilar= elemanlariDegistir(sayilar,ilkIndex,ikinciIndex); //bu satır olmadığı için çalışmadı
        // oluşturulan arrayi sayılar arraylistine atarız, yoksa metodun içinde yapılan işlem havada kalır

        System.out.println(elemanlariDegistir(sayilar,ilkIndex,ikinciIndex));

    }

    private static ArrayList<Integer> elemanlariDegistir(ArrayList<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        // 1, 3, 5, 6, 7
        // değiştrilecek karakter bir integerin içinde saklanır

        int temp= temp=sayilar.get(ilkIndex);
        sayilar.set(ilkIndex,sayilar.get(ikinciIndex));
        sayilar.set(ikinciIndex,temp);

        return sayilar;
    }
}