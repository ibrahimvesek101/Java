package j27_Abstract.abstract01;

public abstract class Honda {// abstract parent class


    public abstract void motor();  // body siz implement zorunlu methode

    abstract void kapı ();

    abstract void koltuk ();



    void sunroof(){
        System.out.println("sunroof çalıştı.");

    }
// abstract Class veriable tanımlanır mı?
    // EVET

    String isim="ibrahim";

    //      abstract String str="javaCan"; // abstract veriable olmaz.


    //  final void finalMethod();  // final abstract method body siz tanımlanamaz.final demek değiştirilemez demek.
    //  halbuki evlatlar kendilerine göre değiştirebilmeli.

    //  final abstract void finalMethod(); // final olamaz

    // private abstract void privateMethod(); // abstract method kısıtlanamaz yani private olamaz.

    //  static void gunesMethod();  // static concrete method  body siz olamaz.

    //  static abstract void gunesMethod(); // abs static  method olamaz.

    //  Honda h1=new Honda(); // abstract Class obj üretemez. Soyut tan üretilemez..


}
