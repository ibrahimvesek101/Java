package Digerleri.interview.src.Day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q003_FibonacciListNumber {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
     public static void main(String[] args) {
         List<Integer> fibonacci = new ArrayList<>();
         Scanner scan = new Scanner(System.in);
         System.out.print("Bir sayi giriniz : ");
         int sayi = scan.nextInt();
         fibonacci.add(0);
         fibonacci.add(1);

         // 0,1,1
         int eleman = 1;
         int i=2;
         while (eleman < sayi) {
             fibonacci.add(eleman);
             i++;
             eleman=fibonacci.get(i - 1) + fibonacci.get(i - 2);
         }
         System.out.println(fibonacci);
     }
}
