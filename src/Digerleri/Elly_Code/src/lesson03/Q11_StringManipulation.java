package Digerleri.Elly_Code.src.lesson03;
import java.util.Scanner;
public class Q11_StringManipulation {
    // Kullanicidan isim ve soyismini girmesini isteyin
    // ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String surName = sc.next();
        System.out.println(name.length()>surName.length() ? "name is longer" : "surname is longer");
    }
}