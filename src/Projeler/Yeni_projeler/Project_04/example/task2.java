package Projeler.Yeni_projeler.Project_04.example;

public class task2 {

    int num1 = 0 ;

    static int num2 = 0 ;

    public void increase(){
        num1++;
        num2++;
    }

    public static void main(String[] args) {

        task2 t2 = new task2();

        t2.increase();
        t2.increase();

        System.out.println(t2.num1);
        System.out.println(num2);

        System.out.println("-----------------");

        task2 t3 = new task2();

        t3.increase();
        t3.increase();

        System.out.println(t3.num1);
        System.out.println(num2);

    }

}
