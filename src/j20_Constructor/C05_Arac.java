package j20_Constructor;

public class C05_Arac {// obj kalıphanesi

    // fields

    String model;
    int maxHiz;

    public C05_Arac(int maxHiz) {//int p li cons.


       //Fields-> obj'nin uretilirken alacagı değer variables
        //bir class'da bir den çok cons tanımlanabilir
     /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
    Aksi takdirde Compile Time Error alirsiniz.
            2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
    birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
            */


        this("hacımurat", 124);
        // this(); -> CTE aynı yerde 2 tane call edilemez.
        this.maxHiz = maxHiz;// p den gelen maxHiz value inst.veriable this ile atandı.
        // this("hacımurat", 123); -> CTE 1. satırda call edilmeli.
        System.out.println("bu yazı: 1 p li const. call edilmiştir.");
    }

    public C05_Arac() {//p siz const.
        System.out.println("bu yazı: p siz const. call edilmiştir.");

    }

    public C05_Arac(String model, int maxHiz) {//full p li (teleskobik ) const.

        this.model = model;
        this.maxHiz = maxHiz;
        System.out.println("bu yazı: teleskobik const. call edilmiştir.");

    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", maxHiz=" + maxHiz;
    }
}
