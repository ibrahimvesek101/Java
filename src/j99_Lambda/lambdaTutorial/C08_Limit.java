package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class C08_Limit {
    public static void main(String[] args) {

        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.
        List<String> yemekList = new ArrayList<>(Arrays.asList("Antep_Baklava", "güllaç", "Sütlaç", "künefe", "güllaç", "baklava"));


        System.out.println("   task01   ");
        KrktrSayıEnBuyuk( yemekList);

        System.out.println("\n   task02   ");

        System.out.println("\n   task03   ");


        System.out.println("\n   task04   ");


        System.out.println("\n   task05   ");


    }// main

    // Task01-> list elemanlarının karakter sayısı en buyuk olanı print code create ediniz...

    public static void KrktrSayıEnBuyuk(List<String> yemekList){

        System.out.println(yemekList
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1)); //java.util.stream.SliceOps$1@7c30a502
        System.out.println("***v.1");
        /*
        limit(a)-> return typ bir Stream oldg için yani yeni bir elelman akışı oldg için birden çok elelman return edebilir.
        dolayısıyla limit() meth çıktısı doğrudan sout parametre olamaz(print edilemez) .
        limit() meth cıktısı array veya List gibi bir collectiona atanmalı.
        */

        Stream<String> enBuyukEleman =yemekList
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1); //java.util.stream.SliceOps$1@7c30a502
        System.out.println(Arrays.toString(enBuyukEleman.toArray()));

        System.out.println("***v.2");

     Object [] yemekArr =  yemekList
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1).toArray();

        System.out.println(Arrays.toString(yemekArr));

        System.out.println("***v.3");

         yemekList
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst();

        System.out.println(Arrays.toString(yemekArr));


        System.out.println("***v.4");

        yemekList
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1).forEach(C01_LambdaExpression::yazdirStr);


    }
}
