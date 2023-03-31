package j31_Map.Tasks;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task03 {
    /*Task->
        1-Ekleme
        2-Listeleme
        3-Arama
        4-Düzeltme
        5-Çıkış
        Seçeneklerini vererek username(key),password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
        Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
        Mainde  Seçenekler ve metodların call edip run ediniz.

         */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //username   diğer bilgiler
        Map<String, Map<String, String>> users = new HashMap<>();


        int secim = 0;

        do {
            System.out.println("**** Menü ****");
            System.out.println("1-Ekleme");
            System.out.println("2-Listeleme");
            System.out.println("3-Arama");    // Kullanıcı username ile diğer  bilgiler print edilmeli.
            System.out.println("4-Düzeltme"); // Kullanıcı username ile diğer  bilgiler update  edilmeli.
            System.out.println("5-Silme");
            System.out.println("6-Çıkış");
            System.out.print("Seçiminiz=");
            secim = input.nextInt();

            switch (secim) {
                case 1:
                    Ekleme(users);
                    break;
                case 2: //Listeleme(users); break;
                case 3: //Arama(users); break;
                case 4: //Duzeltme(users); break;
                case 5: //Silme(users); break;
            }

            System.out.println("users = " + users);
        } while (secim < 6);
    }

    public static void Ekleme(Map<String, Map<String, String>> users) {


        System.out.print("Username=");
        String username = input.nextLine();

        System.out.print("Password=");
        String password = input.nextLine();

        System.out.print("userType=");
        String userTipi = input.nextLine();

        Map<String, String> user = new HashMap<>();
        user.put("password", password);
        user.put("userTipi", userTipi);

        users.put(username, user);
    }

}
