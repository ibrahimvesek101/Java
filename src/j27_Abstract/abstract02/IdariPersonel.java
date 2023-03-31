package j27_Abstract.abstract02;

public class IdariPersonel extends Personel{
    @Override
    public void maasHesapla() {
        System.out.println("idari personel maaşı 21.000 tl");
    }

    @Override
    public void maasBilgisi() {
        System.out.println("idari personel yüksek maaş");
    }

    @Override
    public void sigorta() {
        System.out.println("idari personele full sigorta..");
    }

}
