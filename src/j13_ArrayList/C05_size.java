package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_size {
    public static void main(String[] args) {
        //size()-> listin eleman sayısını return eder.(arr->length)
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.size() = " + ulkelist.size());//5

        ArrayList<String> cityList = new ArrayList<>();
        System.out.println("cityList.size() = " + cityList.size());//0
    }
}