package j27_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {

        Civic c1 = new Civic();
        c1.motor();
        c1.kapı();
        c1.koltuk();
        c1.sunroof();
        c1.lastikEbat();
        c1.isim = "typeRcivic";
        System.out.println("c1 = " + c1.isim);


        Honda c2 = new Accord();

        c2.isim="Accord console car.";
        c2.koltuk();
        c2.kapı();
        c2.motor();
        c2.sunroof();


    }

}
