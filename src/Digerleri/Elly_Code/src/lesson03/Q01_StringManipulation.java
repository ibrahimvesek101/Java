package Digerleri.Elly_Code.src.lesson03;
import java.util.Scanner;
public class Q01_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen isminiz ve soyisminizi giriniz:");
        String firstName = sc.nextLine(), lastName = sc.nextLine();

        String fullName = firstName.concat(" " + lastName).toUpperCase();
        System.out.println("fullName = " + fullName);
    }
}
