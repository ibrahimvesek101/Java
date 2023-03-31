package j24_Encapsulation.Tasks.task01;

public class BmiRunner {
    public static void main(String[] args) {
        Bmi amadAga=new Bmi("ahmet beyy",33,90,1.72);//p'li cons call ile obj create
        System.out.println("amadAga = " + amadAga+amadAga.getStatus());
        Bmi cerenHanımAga=new Bmi("Mıhtar Ceren",34,65,1.73);//p'li cons call ile obj create
        //  System.out.println("Mıhtar Ceren = " + cerenHanımAga+cerenHanımAga.getStatus());
        System.out.println("Mıhtar Ceren = " + cerenHanımAga);
    }
}
