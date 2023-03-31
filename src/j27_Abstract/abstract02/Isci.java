package j27_Abstract.abstract02;

public class Isci extends Personel { ///abstract parent Classa extends child concrete Class
    @Override
    public void maasHesapla() {
        System.out.println("işçi maaş 8000 TL.");

    }
    @Override
    public void maasBilgisi() {
        System.out.println("işçi maaşı asgari ücrettir.");
    }

}
