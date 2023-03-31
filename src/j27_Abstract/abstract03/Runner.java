package j27_Abstract.abstract03;

public class Runner {
    public static void main(String[] args) {

        Cember c1=new Cember();
        c1.name="cember";
        c1.yariCap=5;
        System.out.println("c1.getName() = " + c1.getName());
        c1.ciz();
        System.out.println("c1.alan() = " + c1.alan());
        System.out.println("c1.cevre() = " + c1.cevre());
        System.out.println("c1.toString() = " + c1.toString());

        System.out.println("*** *** ***");
        Dikdortgen d1=new Dikdortgen(12,35);

        d1.name="dikdörtgen";
        d1.ciz();
        System.out.println("d1.alan() = " + d1.alan());
        System.out.println("d1.cevre() = " + d1.cevre());
        System.out.println("d1 = " + d1);
    }
}
