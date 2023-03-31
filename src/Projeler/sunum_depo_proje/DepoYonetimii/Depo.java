package Projeler.sunum_depo_proje.DepoYonetimii;

import java.util.ArrayList;

import static Projeler.sunum_depo_proje.DepoYonetimii.Islemler.scan;

public class Depo implements UrunAlıs, UrunSatıs, UrunTanımlama{

    ArrayList<Urun>urunList=new ArrayList<>();// ürünleri listeleyecek boş ürün listesi
    @Override
    public void urunGirDepoya(int urunİd, int girilenUrunMiktarı) {
        urunList.get(urunİd-IdAtailk).setUrunMiktar(urunList.get(urunİd-IdAtailk).getUrunMiktar()+Math.abs(girilenUrunMiktarı));
        System.out.println("ürününüz başarıyla eklenmiştir"
                         +"\n Ana Menüye Yönlendiriliyorsunuz");

    }
    @Override
    public void urunSat(int urunId, int satılanUrunMiktarı) {
        if(urunList.get(urunId-IdAtailk).getUrunMiktar()>=satılanUrunMiktarı){
            urunList.get(urunId-IdAtailk).setUrunMiktar(urunList.get(urunId-IdAtailk).getUrunMiktar()-Math.abs(satılanUrunMiktarı));
        } else {
            System.out.println("Yeterli miktarda ürün bulunmamaktadır.\n Lütfen tekrar deneyiniz");
            satılanUrunMiktarı=scan.nextInt();
            urunSat(urunId, satılanUrunMiktarı);
        }

    }

    @Override
    public void UrunTanımla(String urunismi, String uretici, String birim) {
        Urun urun1=new Urun(IdAtailk+urunList.size(), urunismi,uretici, birim );
        urunList.add(urun1);

    }

    @Override
    public void urunRafTanımla(int urunId, int rafNo) {
        urunList.get(urunId-IdAtailk).setRafNo(rafNo);
    }
    @Override
    public ArrayList<Urun> urunListele() {

        return urunList;
    }
}