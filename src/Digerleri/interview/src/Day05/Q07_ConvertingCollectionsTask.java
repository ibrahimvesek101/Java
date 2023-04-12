package Digerleri.interview.src.Day05;

import java.util.*;

public class Q07_ConvertingCollectionsTask {

    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Random rnd = new Random();
        for (int i = 0; i <10 ; i++) {
            arr[i] = rnd.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }


}
