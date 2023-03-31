package Projeler.sunum_depo_proje.DepoYonetimii;

import java.util.ArrayList;

public interface UrunAlıs {

    public abstract void urunGirDepoya(int urunİd, int urunMiktarı);


    ArrayList<Urun> urunListele();
}
