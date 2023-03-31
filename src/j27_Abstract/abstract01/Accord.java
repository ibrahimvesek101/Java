package j27_Abstract.abstract01;

public class Accord extends Honda {

    @Override
    public void motor() {// zorunlu gelen method
        System.out.println("Accort motor 2.0 çalıştı. Hız yapma");
    }

    @Override
    void kapı() {// zorunlu gelen method
        System.out.println("Accortta kapı sağlam olur. ");
    }

    @Override
    void koltuk() {// zorunlu gelen method
        System.out.println("Accorta koltuk deri olur.");
    }


    @Override
    void sunroof() {// zorunlu olmayan parentten alınmış method.
        System.out.println("Accorta sunroof çok yakışır.");
    }
}
