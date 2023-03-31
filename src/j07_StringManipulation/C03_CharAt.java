package j07_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
         /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar
         */
        String name="Abdi Arman";
        System.out.println(name.charAt(5));//name Stringdeki 5. index karakteri return eder->A
        char karakter=name.charAt(7);
        System.out.println("abdinin 7. karakteri = " + karakter);//m


        //bir String ifadenin son karakteri ->charAt(length -1).indexdir
        //bir String ifadenin ilk karakteri ->charAt(0).indexdir


        //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz


        //System.out.println("name.charAt(99) = " + name.charAt(99));//rte
        // Trick->charAt()index boyutunu geçerse RTE verir.


        Scanner input=new Scanner(System.in);
        System.out.println("agam bişeyler giresen :");
        String  str=input.nextLine();

        if (str.length()%2==1){
            System.out.println("orta karakter : "+str.charAt((str.length()/2)));
        }else System.out.println("girilen ifadenin orta karakteri yok..");
    }
}