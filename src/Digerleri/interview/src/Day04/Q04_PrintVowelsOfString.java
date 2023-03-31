package Day04;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {
    //Get String from user and print just vowels(aeiou) inside String on the console

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scanner.nextLine().toLowerCase();//soruda kucuk harf istemis o yuzden toLowerCase yaptik
        String str2=str.replaceAll("[^aeiuo]","");
        // ustteki şağka , sağındaki harflerin dışındakiler anlamına gelir
        System.out.println(str2);
    }
}
