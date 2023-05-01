package Projeler.Kendi_Calısmalarım.DepoProjesi;

public class Runner {
    public static void main(String[] args) {

        //başlangıçta 3 adet ürün otomatik eklendi...

        Urunler bal = new Urunler("bal", "balıkesir", 12, "kg", "1");
        Urunler kek = new Urunler("kek", "istanbul", 5, "koli", "2");
        Urunler su = new Urunler("su", "bursa", 1, "ton", "3");
        Methods.urunlerMap.put(100,bal);
        Methods.urunlerMap.put(101,kek);
        Methods.urunlerMap.put(102,su);


        Methods.depoGiris();


    }
}
