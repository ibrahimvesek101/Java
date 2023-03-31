package j27_Abstract.abstract01;

public class Crv extends Honda{
    @Override
    public void motor() {
        System.out.println("CRV motor güçlüdür.");
    }

    @Override
    void kapı() {
        System.out.println("CRV kapıları büyüktür.");

    }

    @Override
    void koltuk() {
        System.out.println("CRV koltuklar oyuncu koltuğu...");

    }
}
