package j24_Encapsulation.encansulation03;

public class Arac {//POJO
/*
 1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
  */


    //1-fields
    private String model;
    private String renk;
    private int motor;
    private int yil;

    //2-constructor

    public Arac(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        //  this.motor = motor;
        setMotor(motor);
        // this.yil = yil;
        setYil(yil);
    }

    public Arac() {

    }
    //3-getters and setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor < 1000) {
            this.motor = 1001;
            System.out.println("Motor hacmi hatalı girildi.");
        } else {
            this.motor = motor;
        }
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil <= 1886) {
            this.yil = Math.abs(yil);
            System.out.println("Girdiğiniz yılda henüz araba üretilmemişti");
            System.out.println("Araç yılını hatalı girdiniz. Lütfen düzeltiniz.");
        } else {
            this.yil = yil;
        }
    }

    //4-toString()

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                        ", renk='" + renk + '\'' +
                        ", motor=" + motor +
                        ", yil=" + yil;
    }


}//class sonu

