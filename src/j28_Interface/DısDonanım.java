package j28_Interface;

public interface DısDonanım {

    void kapı();    //public abstract method tur.

    void kaporta();

    // int age;     -> final veriable initial olmalı.

    String RENK="kırmızı";

    default String sisLamp(){
        return "sisli havada mutlaka kullanılmalı";

    }
    static void anten(){
        System.out.println("anten iyi çekmeli");
    }


    public static void main(String[] args) {
        anten();

    }

}
