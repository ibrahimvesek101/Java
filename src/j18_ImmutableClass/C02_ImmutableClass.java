package j18_ImmutableClass;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_ImmutableClass {
    public static void main(String[] args) {

        /*
        Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
        BigDecimal, BigInteger java'da immutable->değişmez sınıflara örnek olarak gösterilebilir.
          StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
       */
        String name = "İbrahim";
        System.out.println("method öncesi : " + name);
        System.out.println("name.concat(\"QA team leade\") = " + name.concat(" QA team leade"));
        System.out.println("method sonrası : " + name);// Immutable old.için değişmez.


        ArrayList<String> isimList = new ArrayList<>();
        System.out.println("method öncesi isimList = " + isimList);
        isimList.add("ibrahim");
        isimList.add("Neda");
        isimList.add("Vesek");
        System.out.println("methot sonrası isimList = " + isimList); //mutable olduğu için değişti.


    }
}
