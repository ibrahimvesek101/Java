package Digerleri.interview.src.Day05;

public class Q05_WrapperClassTask {

    // create a method that accepts an int
    // and returns twice of that int
    // overload this method with wrapper class: Integer

    // int kabul eden bir metot yarat
    // ve bu int'nin iki katını döndürür
    // bu yöntemi wrapper sınıfıyla overload et : Integer
    public static void main(String[] args) {
        int sayi=5;
        Integer sayiW=16;
        System.out.println("Primitive Katla " + katla(sayi));
        System.out.println("Whapper   Katla " + katla(sayiW));

    }

    private static int katla(int sayi) {
        return sayi*2;
    }
    private static Integer katla(Integer sayi) {
        return sayi*2;
    }


}
