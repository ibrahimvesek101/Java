package j15_Varargs;

public class C02_Varargs_Arrays {
    public static void main(String[] args) {
        int arr[] = {31, 21, 33, 44, 58, 46, 2, 1, 79};
        //Task01-> verilen arra elemanlarının toplamını print eden METHOD create ediniz.
        System.out.println("arrTopla(arr) = " + arrTopla(arr));// 315

        //Task01-> task01 varargs method ile run ediniz.
        System.out.println("varargsTopla(arr) = " + varargsTopla(arr));// 315
        System.out.println("varargsTopla(31, 21, 33, 44, 58, 46, 2, 1, 79) = " + varargsTopla(31, 21, 33, 44, 58, 46, 2, 1, 79));// 315

   /*
   Ahan da TRICK köşesinde böğüün -> varargs methoda girilen parametreler array gibi tanımlandığı için  array parametre de alabilir.
    */



    }//main son

    private static int arrTopla(int[] arr) {//int  arr p'li return type inr method
        int toplam = 0;
        for (int a:arr) {
            toplam+=a;
        }

        return  toplam;
    }

    private static int varargsTopla(int...a ) {//int vararg p'li  int return type  method
        int toplam = 0;
        for (int b:a) {
            toplam+=b;
        }
        return toplam;
    }
}