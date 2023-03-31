package j04_JavaOperators.j01_AritmeticOperators;

public class C04_MathMethods {
    public static void main(String[] args) {
/*
     Math.abs(a)
     Girilen degerin mutlak degerini verir.

    Math.max(a, b)
    Girilen iki degerden buyuk olani verir.

    Math.min(a, b)
    Girilen iki degerden kucuk olani verir.

    Math.round(a)
    Girilen degerin en yakin tamsayiya yuvarlar.

    Math.sqrt(a)
    Girilen degerin karekokunu verir.

    Math.pow(a, b)
    Girilen a ve b degerini a uzeri b olarak verir.

    Math.ceil(a) 3.1 => 4
    Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

    Math.floor(a) 3.7 => 3
    Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.
     */

        /* 81 sayısının karekökünü alalım
         */

        System.out.println("81'in karekök değeri : " + Math.sqrt(81));//9.0
        System.out.println("sayinin mutlak degeri :"+Math.abs(-34));//34

        // Math.abs
        System.out.println( "abs of - 10: " + Math.abs(-10));

        // Math.max(a, j08_ifStatement_TernaryOperator.b)
        System.out.println( "max of (5, 11): " + Math.max( 5, 11 ) );

        // Math.min(a, j08_ifStatement_TernaryOperator.b)
        System.out.println( "min of (5, 15): " + Math.min( 5, 15 ) );

        // Math.round(a)
        System.out.println( "round of 3.1: " + Math.round( 3.1 ) );
        System.out.println( "round of 3.5: " + Math.round( 3.5 ) );

        // Math.ceil(a)
        System.out.println( "ceil of 3.1: " + Math.ceil( 3.1 ) );
        System.out.println( "ceil of 3.5: " + Math.ceil( 3.5 ) );

        // Math.floor(a)
        System.out.println( "floor of 3.1: " + Math.floor( 3.1 ) );
        System.out.println( "floor of 3.5: " + Math.floor( 3.5 ) );

        // Math.sqrt(a)
        System.out.println( "sqrt of 4: " + Math.sqrt( 4 ) );
        System.out.println( "sqrt of 16: " + Math.sqrt( 16 ) );

        // Math.pow
        System.out.println( "pow of (3, 2): " + Math.pow( 3, 2 ) );
        System.out.println( "pow of (2, 4): " + Math.pow( 2, 4 ) );







    }


}
