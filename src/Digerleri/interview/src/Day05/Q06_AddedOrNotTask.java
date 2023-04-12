package Digerleri.interview.src.Day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q06_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);

        Set<Integer> uniqeNumbers = new HashSet<>();
        List<Integer> duplicateNumbers = new ArrayList<>();
        for (int i = 0; i <numbers.size() ; i++) {
            boolean varMi = uniqeNumbers.add(numbers.get(i));
            if (!varMi) duplicateNumbers.add(numbers.get(i));
        }
        System.out.println("duplicateNumbers = " + duplicateNumbers);
        System.out.println("Tekrarlanan eleman sayısı = "+duplicateNumbers.size());
    }

}
