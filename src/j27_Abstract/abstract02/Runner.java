package j27_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci i1 = new Isci();
        i1.name = "biloCan";
        System.out.println("i1.name = " + i1.name);
        i1.maasBilgisi();
        i1.maasHesapla();


        System.out.println();//boşluk

        IdariPersonel idari = new IdariPersonel();

        idari.name = "müdür";
        System.out.println("idari.name = " + idari.name);
        idari.maasBilgisi();
        idari.maasHesapla();
        idari.sigorta();


    }

}
