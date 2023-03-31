package Digerleri.Elly_Code.src.lesson02;

import java.util.Scanner;

public class Q11_SwitchCase {
    /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir gün giriniz :");
        String gun = input.nextLine().toLowerCase();

            switch (gun) {
                case "pazartesi":
                case "salı":
                    System.out.println("Java dersi gunleri");
                    break;
                case "perşembe":
                case "cuma":
                    System.out.println("Selenyum dersi gunleri");
                    break;
                case "çarşamba":
                case "cumartesi":
                    System.out.println("SQL dersi gunleri");
                    break;
                case "pazar":
                    System.out.println("izin gunu");
                    break;

                default:System.out.println("lütfen bir gün giriniz");
            }
        }
    }