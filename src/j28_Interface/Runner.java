package j28_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin s1=new Sahin();
        s1.kapı();
        s1.kaporta();
        s1.jant();
        s1.ebat();
        s1.koltuk();
        s1.klima();
        s1.motor();
        s1.yakit();
        s1.sisLamp();
        s1.sunroof();

        DısDonanım.anten();
       // DısDonanım.RENK();
        System.out.println("DısDonanım.RENK = " + DısDonanım.RENK);

        System.out.println("IcDonanım.RENK = " + IcDonanım.RENK);

        System.out.println("Lastik.RENK = " + Lastik.RENK);

        System.out.println("IcDonanım.MUSİC = " + IcDonanım.MUSİC);

        System.out.println("IcDonanım.KUMAŞ = " + IcDonanım.KUMAŞ);

    }
}
