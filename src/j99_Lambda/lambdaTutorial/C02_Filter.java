package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
        printEtCiftElemanStructured(sayiList);

        System.out.println("\n*** task02***");
        printCiftElemanFunctional(sayiList);

        System.out.println("\n*** task03***");
        print35KucukCiftElemanFunctional(sayiList);

        System.out.println("\n*** task04***");
        print35BuyuTekElemanFunctional(sayiList);
    }//main

    //task01->"Structuredz Programming"--> AMELE Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
    public static void printEtCiftElemanStructured(List<Integer> sayiList) {

        for (Integer s : sayiList) {
        if (s%2==0) {
            System.out.print(s+" ");
        }
        }
    }

    //task02-> "Functional Programming"--> CINCIX Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
public static void printCiftElemanFunctional(List<Integer>sayiList){
        sayiList
                .stream()
                .filter(C01_LambdaExpression::ciftMi)
                .forEach(C01_LambdaExpression::yazdir);     //akısta filtrelenen elemanlar yazdır
}
//task03-> "Functional Programming"--> CINCIX Programming kullanarak
// listin 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz

    public static void print35KucukCiftElemanFunctional(List<Integer>sayiList){
        sayiList
                .stream()
                .filter(C01_LambdaExpression::ciftMi).filter(t->t<35).forEach(C01_LambdaExpression::yazdir);

        //akısta filtrelenen elemanlar yazdır
    }

    //task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin 34'den buyuk
    // yada  tek elemanlarını aynı satırda aralarında bosluk ile print ediniz

    public static void print35BuyuTekElemanFunctional(List<Integer>sayiList){
        sayiList
                .stream()
                .filter(t->t%2==1|| t>34)
                .sorted()                       // bir de sıraladık..
                .forEach(C01_LambdaExpression::yazdir);

        //akısta filtrelenen elemanlar yazdır



    }
}
