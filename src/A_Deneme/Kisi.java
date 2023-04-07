package A_Deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kisi {


    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));

        sayiList.stream().
                filter(t -> t%4==0).
                forEach(System.out::println);

        System.out.println("***");
        sayiList.stream().filter(t->t%4==0).map(t -> t *2).forEach(System.out::println);


    }
}
