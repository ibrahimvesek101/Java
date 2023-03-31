package j27_Abstract.abstract01;

public class Civic extends Lastik{

    /*
extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
java CTE verdi
çözüm:
a) Unımplemented (uyarlanmamış) method implement edilmeli
b)parent Honda class'dan abstarct keyword kaldırılmalı
c)concrete olan child Civic class abstract tanımlanmalı
 */

    // concerete class'da abstract method tanımlanır mı?
    // public  abstract void absMethod();// ya class abs olmalı yada method concrete body olmalı..
    // TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli

    @Override
    public void motor() {
        System.out.println("civic motor aile için yeterlidir.");
    }

    @Override
    void kapı() {

        System.out.println("civic kapıları güzel.");
    }

    @Override
    void koltuk() {

        System.out.println("civic koltuklar kadife..");
    }

    @Override
    public void lastikEbat() {
        System.out.println("civic lastikler kibar.");
    }

 // Civic c1 = new Civic();// civic child class data type obj.
 // Honda c2 = new Civic(); //Honda parent class data type obj.



}
