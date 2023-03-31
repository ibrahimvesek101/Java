package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // -->> Girilen sayının varlığını kontrol etme
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 46, 44, 27, 21, 79, 31, 20, 58, 38, 59, 33));
        Scanner input = new Scanner(System.in);
        System.out.print("aradığınız sayıyı giriniz : ");
        int sayi = input.nextInt();
        boolean bayrak = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == sayi) {
                bayrak = true;
                break;
            }
        }
        if (bayrak) {
            System.out.println("Aradığınız sayı mevcuttur. ");

        } else {
            System.out.println("Aradığınız sayı bulunamadı.");
        }
    }
}
