package Digerleri.Elly_Code.src.lesson02;

public class Q04_IncrementDecrement {
    /*
      Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
      Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
     */
    public static void main(String[] args) {
        System.out.println("increment-artirma");

        int x = 1;

        System.out.println(++x); //2
        System.out.println(x++); //2 value =3
        System.out.println(x);   //3

        System.out.println("decrement-azaltma");

        int y = 5;
        System.out.println(--y); //4
        System.out.println(y--); //4 value =3
        System.out.println(y); //3

        int a = 20;
        int b = 15;
        System.out.println(++a + b--);  //21+15 =36 b value 14
        System.out.println("a = " + a); //a = 21
        System.out.println("b = " + b); //b = 14

        System.out.println(++a + --b);  //22+13 =35
        System.out.println("a = " + a); //a =22
        System.out.println("b = " + b); //b =13


        int z = 5;
        //                 6     6      7      7    7    6
        System.out.println(++z + z++ + z++ + --z + z-- + z); // 39
        System.out.println("z = " + z); //6
    }


}
