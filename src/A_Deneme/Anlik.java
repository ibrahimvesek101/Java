package A_Deneme;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;


import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

public class Anlik {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(12, 12, 21, 21, 34));

        Set<Integer> set = new HashSet<>(arrList);
        System.out.println("set = " + set);


    }
}