package j30_Collection.Set;
import java.util.*;
public class Task01 {
    public static void main(String[] args) {

        /* Task->
 Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
 main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
 */

        String arr [] = {"domates", "biber", "patlıcan ","kabak"};


        arrListCevir(arr);

        System.out.println(" ilk arr = " +Arrays.toString(arr));

        HashSet<String> hs = new HashSet<>(arrListCevir(arr));
        LinkedHashSet <String> hsList = new LinkedHashSet<>(arrListCevir(arr));
        TreeSet<String> ts=new TreeSet<>(arrListCevir(arr));

        System.out.println("hurra set = " + hs);
        System.out.println("erken gelen oturur set = " + hsList);
        System.out.println("müdür set = " + ts);
    }

    private static ArrayList<String> arrListCevir(String[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
