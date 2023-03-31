package j07_StringManipulation;

public class C16_UpperCaseLowerCase {

    public static void main(String[] args) {
        /*
        toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
       toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
       ignoreCase()-> verilen string'i BUYU-kucuk harf duyarlılığını kaldırır.
         */

        String str="javaCAN'lara selam bolcana offer :)";
        System.out.println("str = " + str);//javaCAN'lara selam bolcana offer :)
        System.out.println("str.toUpperCase() = " + str.toUpperCase());// JAVACAN'LARA SELAM BOLCANA OFFER :)
        System.out.println("str.toLowerCase() = " + str.toLowerCase());//javacan'lara selam bolcana offer :)
        System.out.println("str = " + str);//javaCAN'lara selam bolcana offer :)

    }
}