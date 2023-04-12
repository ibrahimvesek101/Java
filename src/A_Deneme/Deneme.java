package A_Deneme;

import java.util.*;

public class Deneme {



    public static void main(String[] args) {


        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(10,12,12,23,20,20));

        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.addAll(arrList);
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.addAll(arrList);

        System.out.println(hashSet);
        System.out.println(treeSet);
    }
}
