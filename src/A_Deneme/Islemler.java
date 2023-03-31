package A_Deneme;

public class Islemler {
    public static void main(String[] args) {

        Arac volvo = new Arac();
        volvo.marka = "volvo";
        volvo.km = 10000;
        volvo.ikinciEl = true;
        volvo.Renk = "siyah";
        volvo.motor = 2;
        volvo.yıl = 2022;

        System.out.println("volvo = " + volvo);

        Arac bmw = new Arac("Bmw", "beyaz", true, 23000, 2020, 3);
        System.out.println("bmw.toString() = " + bmw.toString());

        new Arac();
        System.out.println(new Arac("mercedes", "kırmızı", false, 1000, 2023, 3));


        volvo.setKm(0);
        System.out.println("volvo.km = " + volvo.km);

    }

}