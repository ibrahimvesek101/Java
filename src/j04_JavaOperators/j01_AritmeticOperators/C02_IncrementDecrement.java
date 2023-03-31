package j04_JavaOperators.j01_AritmeticOperators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        /*
         Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
		 Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
			 */
        System.out.println("   **** Increment-> Artırma *****    ");


        int a = 1;
        System.out.println(++a); //önce artır sonra yazdır-> 2
        System.out.println(a++); //önce (eski değer)yazdırır sonra artır->2 ama a=3
        System.out.println(a);  //3

        a = 1;
        System.out.println(a++ + ++a);
        // 1 + 3 = 4


        System.out.println("-------------------Azaltma");
        int b = 5;
        System.out.println(--b);  //4
        System.out.println(b--);  //4
        System.out.println(b);  //3


        System.out.println("-------------SORU1-----------------");
        int x = 20;
        int y = 15;

        System.out.println(++x + --y);  //21 + 14 =35  x= 21   y=14
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");
        System.out.println(++x + y--);  // 21 + 15=36  x=21 y=14
        System.out.println(x);
        System.out.println(y);


        System.out.println("-------------SORU2-----------------");

        x = 20;
        y = 15;

        System.out.println(x++ + y--);  // 20+15=35   x=21 y=14
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");

        System.out.println(x++ + --y);  // 20+14 =34  x=21 y=14
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");


        int k = 5;

        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        //  6  + 6 +  7   + 7 + 7 + 6 = 39   k=6

        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);


    }
}
