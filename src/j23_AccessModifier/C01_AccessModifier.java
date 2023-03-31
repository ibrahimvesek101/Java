package j23_AccessModifier;//package level
import j23_AccessModifier.baskaPackage.C03_AccessModifierRunner;
/*
             1) "private" class member'lar sadece icinde bulunduklari class'lardan erişilebilir.
                Diğer class'lardan "private" class member'lara erişilemez
             2) Diğer package'lerden   olusturulan object için class'i import edilmeli
             3) Diğer package'lerden default class memberlara erişilemez.
               "default"  "package private" sağlar
             4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).
             5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
              için : a)Child class erişebilir.    b)Child class degil ise erişilemez.
             6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
              Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.
     */
public class C01_AccessModifier {//Class level
    private int privateYas = 33;
    int defaultYas = 24;//AccMo yazılmazsa default olarak tanımlanır(JVM derlenir).
    protected int protectedYas = 40;
    public int publicYas = 48;
    private C01_AccessModifier() {//private p'siz default cons.
        System.out.println("Agam'a private p'siz cons. selamkeee :) ");
    }
    public C01_AccessModifier(int ilkYas, int sonYas) {//private p'li  cons.
        System.out.println("Agam'a public p'li cons. selamkeee :) ");
    }
    private static void privateMethod() {
        System.out.println("Agam'a private METH. selamkeee :) ");
    }
    protected void protectedMethod() {
        System.out.println("Agam'a protected METH. selamkeee :) ");
    }
    // C01_AccessModifier obj = new C01_AccessModifier();//private p'siz cons call edilerek obj create edildi->private cons kendi class'dab call edilebilir
}//Class sonu