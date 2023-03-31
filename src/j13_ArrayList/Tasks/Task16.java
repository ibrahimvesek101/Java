package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task16 {

    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    Çalışanlar,  İşverenler,Şirketler olmak üzere 3 DiziListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */

    public static void main(String[] args) {

        ArrayList<ArrayList> list1 = new ArrayList<>();

        ArrayList<String> calisanlar = new ArrayList<>(Arrays.asList("ahmet","mehmet"));
        ArrayList<String> isverenler = new ArrayList<>(Arrays.asList("Muhammet","ibrahim"));
        ArrayList<String> sirketler = new ArrayList<>(Arrays.asList("Nasa","IBM"));

        list1.add(isverenler);
        list1.add(calisanlar);
        list1.add(sirketler);
        System.out.println("list1 = " + list1);

    }
}
