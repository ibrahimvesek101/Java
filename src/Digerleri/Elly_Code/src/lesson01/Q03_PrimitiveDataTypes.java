package Digerleri.Elly_Code.src.lesson01;

public class Q03_PrimitiveDataTypes {

    /*
      * Primitive data type
             byte: only takes whole numbers
              short: only takes whole numbers
              int(used more often): only takes whole numbers
              long: only takes whole numbers

              float: can take decimals (MUST have F or f at the end)
              double( used more often): can take decimals

              boolean: true or false boolean expressions
              char: character within single quote ''
                       also takes number
      * Range: double > float >long > int >short > byte
      * !!! soutv degeri ile yazdirma
      */
    public static void main(String[] args) {
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

    //    byte byteMin = Byte.MIN_VALUE;
    //    // data type variable name  =  assignment(deger atama)
    //    // declaration (olusum)
    //    System.out.println("byteMin = " + byteMin); //byteMin = -128
    //    byte byteMax = Byte.MAX_VALUE;
    //    System.out.println("byteMax = " + byteMax); //byteMax = 127
//
    //    short shortMin = Short.MIN_VALUE;
    //    System.out.println("shortMin = " + shortMin);  //shortMin = -32768
//
    //    short shortMax = Short.MAX_VALUE;
    //    System.out.println("shortMax = " + shortMax); //shortMax = 32767
//
    //    int intMin = Integer.MIN_VALUE;
    //    System.out.println("intMin = " + intMin); //intMin = -2147483648
//
    //    int intMax = Integer.MAX_VALUE;
    //    System.out.println("intMax = " + intMax);  //intMax = 2147483647
//
    //    long longMin = Long.MIN_VALUE;
    //    System.out.println("longMin = " + longMin);
//
    //    long longMax = Long.MAX_VALUE;
    //    System.out.println("longMax = " + longMax);
//
    //    double doubleMin = Double.MIN_VALUE;
    //    System.out.println("doubleMin = " + doubleMin);
//
    //    double doubleMax = Double.MAX_VALUE;
    //    System.out.println("doubleMax = " + doubleMax);
//
    //    float floatMin = Float.MIN_VALUE;
    //    System.out.println("floatMin = " + floatMin);
//
    //    float floatMax = Float.MAX_VALUE;
    //    System.out.println("floatMax = " + floatMax);
//

        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float telFiyat = 999999.99F;
        double  piNumber = 3.14;
        char cinsiyet = 'E';
        boolean saidYes = true;

        System.out.println("telFiyat = " + telFiyat); //telFiyat = 1000000.0
        System.out.println("piNumber = " + piNumber); //piNumber = 3.14
        System.out.println("cinsiyet = " + cinsiyet); //cinsiyet = E
        System.out.println("saidYes = " + saidYes);  //saidYes = true


    } //mainSonu



} //class Sonu





