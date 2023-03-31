package j25_Inheritance.inheritance01;

public class Runner {
    public static void main(String[] args) {

        Hayvancık h=new Hayvancık();

        h.beslen();
        h.hareket();
        h.icme();

        System.out.println("    *******");

        Memeliler m1=new Memeliler();

        m1.dogum();
        m1.beslen();
        m1.sutBeslen();
        m1.hareket();
        m1.icme();

        System.out.println("    *******");

        Balık b=new Balık();

        b.ızgaraTava();
        b.hareket();
        b.beslen();
        b.icme();

        System.out.println("    *******");

        Kedi k1=new Kedi();

        k1.beslen();
        k1.dogum();
        k1.cırmala();
        k1.hareket();
        k1.sutBeslen();
        k1.icme();

        System.out.println("    *******");

        Koyun ko=new Koyun();

        ko.semir();
        ko.beslen();
        ko.hareket();
        ko.dogum();
        ko.icme();
        ko.sutBeslen();

    }
}
