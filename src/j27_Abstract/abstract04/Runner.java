package j27_Abstract.abstract04;

public class Runner {
    public static void main(String[] args) {
        Baklava havucDilimi=new Baklava();
        havucDilimi.name="fıstıklı baklava";
        havucDilimi.madeIn();
        System.out.println("havucDilimi = " + havucDilimi);
        havucDilimi.taste();

        System.out.println();

        SezarSalad sezer=new SezarSalad();
        sezer.name="sezer salad";
        sezer.madeIn();
        System.out.println("sezer = " + sezer);
        System.out.println();

    }
}
