package j10_MethodCreation;
import java.util.Scanner;
public class C03_MethodCreation {
    public static void main(String[] args) {

        String javaCAN = "ibrahim";
        String javaTAR = "vesek";
        
        selamVer();

        C03_MethodDepo.gecmeNotu(55);//C03 ten call edildi.

        System.out.println(javaTAR);
    }

    public static void selamVer() {

        System.out.println("javaTAR'a selamlar...");

    }
}
