package j32_Enum.enum04;

public enum Aylar {
    OCAK(31),
    ŞUBAT(28),
    MART(31),
    NİSAN(30),
    MAYIS(31),
    HAZİRAN(30),
    TEMMUZ(31),
    AĞUSTOS(31),
    EYLÜL(30),
    EKİM(31),
    KASIM(30),
    ARALIK(31);

int gunSayisi;
   // Aylar(int gunSayisi,String mevsim,String birthday) {    // enum field lara parametre cons. tanımlandı.
    Aylar(int gunSayisi) {    // enum field lara parametre cons. tanımlandı.
        this.gunSayisi=gunSayisi;

    }
    void gunMiktari(){


    }
}
