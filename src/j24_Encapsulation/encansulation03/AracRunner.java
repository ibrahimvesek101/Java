package j24_Encapsulation.encansulation03;

public class AracRunner {
    public static void main(String[] args) {

        Arac arac1 = new Arac();// p siz cons. call edildi. (madde-4)

        Arac arac2 = new Arac("Mercedes","siyah",2000,2021);

        Arac arac3 = new Arac("BMW","Beyaz",-2500,200);


  //    System.out.println("arac1.getModel() = " + arac1.getModel()); //null
  //    System.out.println("arac1.getRenk() = " + arac1.getRenk());//null
  //    System.out.println("arac1.getYil() = " + arac1.getYil());//0
  //    System.out.println("arac1.getMotor() = " + arac1.getMotor());//0

  //    arac1.setModel("hacı murat");
  //    arac1.setYil(-1974);
  //    arac1.setMotor(1300);
  //    arac1.setRenk("beyaz");

  //    System.out.println("arac1.getModel() = " + arac1.getModel()); //null
  //    System.out.println("arac1.getRenk() = " + arac1.getRenk());//null
  //    System.out.println("arac1.getYil() = " + arac1.getYil());//0
  //    System.out.println("arac1.getMotor() = " + arac1.getMotor());//0

        System.out.println("arac2 = " + arac2);
        System.out.println("arac3 = " + arac3);

    }
}
