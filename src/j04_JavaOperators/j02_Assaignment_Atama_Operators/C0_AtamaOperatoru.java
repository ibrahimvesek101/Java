package j04_JavaOperators.j02_Assaignment_Atama_Operators;

public class C0_AtamaOperatoru {
    public static void main(String[] args) {

        //    =	        x = 8	    x = 8
        //    +=	    x += 3	    x = x + 3
        //    -=	    x -= 3	    x = x - 3
        //    *=	    x *= 3	    x = x * 3
        //    /=	    x /= 3	    x = x / 3
        //    %=	    x %= 3	    x = x % 3

        int yas = 33;
        System.out.println(yas + 5);//38-> atama (=) olamdıgı için yas=33 hala sadece yas değerinin 5 fazlası print edildi.
        // variable'ye eğer atama yapılmazsa yapılan işlemin sonucu  kalici olmaz.
        // bir variable'in degerini kalici olarak artirmak veya azaltmak için mutlaka assignment yapılmalı.
        System.out.println("yas = " + yas);//yas = 33
        System.out.println( yas += 11);//44-> atama yapıldığı için yas=44
    }
}
