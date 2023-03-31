package j25_Inheritance.task01;

public class Runner {//step 5

    public static void main(String[] args) {
        A a = new A();
        System.out.println("a.aga = " + a.aga);//bad paractice:static variable obj name ile call edilmez
        System.out.println("A.aga = " + A.aga);//best paractice:static variable Class name ile call edilir

        B b = new B();
        System.out.println("B.aga = " + B.aga);
        System.out.println("b.aga = " + b.aga);
    }
}