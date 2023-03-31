package Digerleri.interview.src.Day03;

import java.util.Scanner;

public class Q03_HackerLanguage {

    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method
// (method ismi hackerDili) yazınız. Hackerlar bazı harfleri sayılara çevirerek
// yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)
    public static void main(String[] args) {
        String str = "Java ile herşey güzel";
        str = hackerDili(str);
        System.out.println(str);
    }
    private static String hackerDili(String str) {
        str = str.replaceAll("s", "5");
        str = str.replaceAll("a", "4");
        str = str.replaceAll("e", "3");
        str = str.replaceAll("i", "1");
        str = str.replaceAll("o", "0");


        return str;
    }


}