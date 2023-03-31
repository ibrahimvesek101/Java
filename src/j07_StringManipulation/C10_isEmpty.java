package j07_StringManipulation;

public class C10_isEmpty {
    public static void main(String[] args) {
         /*
          String IsEmpty
           String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
          isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
          Yani o String'in length() 0 demektir.
          length()==0 demek isEmpty() true verir demektir.
          Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanılır, "isEmpty()" kullanılmaz

         */
        String str = "javaCAN'lara selam bolcana offer :) ";

        System.out.println("str.isEmpty() = " + str.isEmpty());//false
        System.out.println(str.length());//36

        String str1 =" ";
        System.out.println("str1.isEmpty() = " + str1.isEmpty());//false

        String str2 ="";
        System.out.println("str2.isEmpty() = " + str2.isEmpty());//true

        String str3 =null;
        //  System.out.println("str3.isEmpty() = " + str3.isEmpty());//RTE

        //isBlank()-> hem "boş tanımlanan  String" için hem de "sadece space" içeren Strinler içn true diğerlerine false return eder

        System.out.println("str1.isBlank() = " + str1.isBlank());//str1.isBlank() = true
        System.out.println("str2.isBlank() = " + str2.isBlank());//str2.isBlank() = true
        String str4 ="   b   ";
        System.out.println("str4.isBlank() = " + str4.isBlank());//false->  boş değil
        String str5 ="x";
        System.out.println("str5.isBlank() = " + str5.isBlank());////false->  boş değil

        //isBlank()-> ya boş ya da space olmalı.
        //System.out.println("str3.isBlank() = " + str3.isBlank());//RTE
    }

}