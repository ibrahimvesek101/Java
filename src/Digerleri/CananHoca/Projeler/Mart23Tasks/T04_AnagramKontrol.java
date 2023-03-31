package Digerleri.CananHoca.Projeler.Mart23Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol {
    public static void main(String[] args) {
        /*
		 * Anagram, bir kelimenin harflerinden baska bir kelime
		 * olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan
			* Java code create ediniz
			isAnagram("listen", "Silent") ==> true
			*
			* listen
			* silent

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci kelimeyi giriniz");
        String kelime1 = scan.next();
        System.out.println("ikinci kelimeyi giriniz");
        String kelime2 = scan.next();

        isAnagram(kelime1, kelime2);
        System.out.println(isAnagram(kelime1, kelime2));

    }

    private static boolean isAnagram(String kelime1, String kelime2) {
        boolean anagramMi = true;

        char[] arr = kelime1.replace(" ", "").toLowerCase().toCharArray();
        char[] arr2 = kelime2.replace(" ", "").toLowerCase().toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);


        if (arr.length != arr2.length) {
            anagramMi = false;
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != arr2[i]) {
                anagramMi = false;
            }

        }
        return anagramMi;

    }
}
