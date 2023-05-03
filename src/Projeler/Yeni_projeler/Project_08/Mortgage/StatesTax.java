package Projeler.Yeni_projeler.Project_08.Mortgage;

public enum StatesTax {
      /*

        Create a enum name is StatesTax
            Add Enumerated data types as
                NEWYORK amount of the tax 20
                NEWJERSEY amount of the tax 15
                FLORIDA amount of the tax 5
                OHIO amount of the tax 12

                create a private vairable int tax;
                create the constructor

                create a read method of the tax

    */

 /*

         StatesTax isminde enum oluşturun
            Enumerated veri tipini şu şekilde ekle
                NEWYORK tax tutarı 20
                NEWJERSEY tax tutarı 15
               FLORİDA tax tutarı 20
                OHIO tax tutarı 20

                 private vairable int tax oluştur;
                 constructor  oluştur

              tax'ın  read methodunu oluştur

    */

    NEWYORK(20),
    NEWJERSEY(15),
    FLORIDA(5),
    OHIO(12);

    private int tax;

    StatesTax(int vergiMiktari) {
        this.tax = vergiMiktari;
    }

    public int getTax() {
        return tax;
    }


}



