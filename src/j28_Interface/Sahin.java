package j28_Interface;

public class Sahin extends Tofas implements DısDonanım,IcDonanım,Lastik {

    @Override
    public void motor() {
        System.out.println("sahin motoru çok ses yapıyor.");
    }

    @Override
    public void yakit() {
        System.out.println("sahin az yakıt yakar.");
    }

    @Override
    public void kapı() {
        System.out.println("sahin 4 kapısı var ");
    }

    @Override
    public void kaporta() {
        System.out.println("sahin KAPORTASI dökülüyor...");
    }

    @Override
    public void koltuk() {
        System.out.println("sahin KOLTUKLAR");
    }

    @Override
    public void klima() {
        System.out.println("KLİMA soğutur..");
    }

    @Override
    public void ebat() {
        System.out.println("LASTİK ebatlar büyük");
    }

    @Override
    public void jant() {
        System.out.println("JANT 5 kollu");
    }
}
