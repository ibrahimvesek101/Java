package Digerleri.interview.src.Day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q01_SetTask {

    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        arrList.add(20);
        arrList.add(50);

        System.out.println("arrList = " + arrList);
        Set<Integer> set = new HashSet<>();
        Set<Character> setCharacter = new HashSet<>();
        System.out.println("set = " + set);
        set=arrayListtenSetOlustur(arrList);

        arrayListtenSetOlustur2(arrList,set);
        System.out.println("set = " + set);
        karekterleriSeteEkle(setCharacter,'a','A', 'B', 'A','c','B');
        System.out.println("setCharacter = " + setCharacter);
    }

    private static void karekterleriSeteEkle(Set<Character> set, Character ...chars) {
        for (int i = 0; i < chars.length ; i++) {
            set.add(chars[i]);
        }
    }

    private static void arrayListtenSetOlustur2(ArrayList<Integer> arrList, Set<Integer> set) {
        for (Integer sayi:arrList ) {
            set.add(sayi);
        }
    }

    private static Set<Integer> arrayListtenSetOlustur(ArrayList<Integer> arrList) {
        Set<Integer> set = new HashSet<>();
        for (Integer sayi:arrList ) {
            set.add(sayi);
        }
        return set;

    }
}
