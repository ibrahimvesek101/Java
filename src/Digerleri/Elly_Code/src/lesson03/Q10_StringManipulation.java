package Digerleri.Elly_Code.src.lesson03;

public class Q10_StringManipulation {


    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.
    public static void main(String[] args) {
        String str = "   Java ogrenmek123 Cok guzel@      ";
        str = str.replaceAll("\\d", "").  //"   Java ogrenmek Cok guzel@      "
                replaceAll("C", "c").   //"   Java ogrenmek cok guzel@      "
                replaceAll("@", "").    //"   Java ogrenmek cok guzel      "
                trim();                              //"Java ogrenmek cok guzel"
        System.out.println(str);
        //   System.out.println(str.replaceAll("\\d", "").replaceAll("@", "").replaceAll("C", "c").trim());
    }
}