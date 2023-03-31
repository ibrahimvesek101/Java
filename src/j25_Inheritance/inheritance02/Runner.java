package j25_Inheritance.inheritance02;

public class Runner {
    public static void main(String[] args) {
        //data type obj =   Cons.
        Kedi k1 = new Kedi();   // KEDİ DATA TYPE OBJ
        System.out.println("k1.a = " + k1.a); //0 hayvancık
        System.out.println("k1.c = " + k1.c); //2 kedi
        System.out.println("k1.d = " + k1.d); //7 kedi
        System.out.println("k1.m = " + k1.m); // 1 memeli

        // TRICK=  data tipine göre call edilir  (KEDİ ler de var mı?)

        Memeliler k2 = new Kedi("pamuk"); // MEMELİ DATA TYPE OBJ
        System.out.println("k2.a = " + k2.a); //0 hayvancık
        System.out.println("k2.c = " + k2.c); //4 MEMELİ
        // System.out.println("k2.d = " + k2.d); //
        System.out.println("k2.m = " + k2.m); // 1 memeli

        // TRICK=  data tipine göre call edilir  (MEMELİLER ler de var mı?)

        Hayvancık k3 = new Kedi("pamuk");   // HAYVANCIK DATA TYPE OBJ

        System.out.println("k3.a = " + k3.a); // 0 HAYVANCIK
        //    System.out.println("k3.c = " + k3.c); // CTE
        //    System.out.println("k3.d = " + k3.d); // CTE
        System.out.println("k3.m = " + k3.m); // 3 HAYVANCIK

        // TRICK=  data tipine göre call edilir  (HAYVANCIK ta var mı?)


        System.out.println("***");

        k1.mA();
        k1.mC();
        k1.mM();
        System.out.println("***");

        k2.mA();
        k2.mC();
        k2.mM();
        System.out.println("***");

        k3.mA();
        //  k3.mC();
        k3.mM();

    }//main

}//Class
