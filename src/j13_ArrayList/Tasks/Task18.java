package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        /* Task->  Verilen bir listede, istenen iki index'deki elementlerin yerini
         kalici olarak degistiren bir method create ediniz

         */
        ArrayList<String> isimler=new ArrayList<>(Arrays.asList("Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println("İsim listeniz = "+isimler);

        Scanner input=new Scanner(System.in);
        System.out.print("Değiştirmek isteğiniz 1.indexi giriniz : ");
        int bir=input.nextInt();

        System.out.print("Değiştirmek isteğiniz 1.indexi giriniz : ");
        int iki=input.nextInt();

        String depo2;
        depo2=isimler.get(bir);

        isimler.set(bir,isimler.get(iki));
        isimler.set(iki,depo2);

        System.out.println("Yeni listeniz = " + isimler);


    }
}
