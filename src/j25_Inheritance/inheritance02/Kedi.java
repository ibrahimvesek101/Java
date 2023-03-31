package j25_Inheritance.inheritance02;

public class Kedi extends Memeliler {// parent Memeliler child class..
int c=2;
int d=7;

    public Kedi() {
        super();//
        System.out.println("kedi p siz cons.");
    }

    public Kedi(String c) {
        this(); //bu class taki p siz cons. call edildi.
        System.out.println(super.c);
       System.out.println("kedi p li cons.");

    }
    @Override
    public void mC(){

        System.out.println("kedi class method");

    }
}
