package Projeler.sunum_depo_proje.DepoYonetimii;

import java.util.ArrayList;

public interface UrunTanımlama {

   int IdAtailk=1001;

   void UrunTanımla(String urunismi, String uretici,String birim);// abstract method tanımlandı

    void urunRafTanımla(int urunId,int rafNo); // abstract method tanımlandı

    ArrayList<Urun> urunListele= new ArrayList<>();

}
