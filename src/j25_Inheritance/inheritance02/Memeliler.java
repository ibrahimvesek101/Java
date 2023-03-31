package j25_Inheritance.inheritance02;

public class Memeliler extends Hayvancık { // Hayvancık parent class extend edilmiş Memeliler child class..
int m=1;
int c=4;

    public  Memeliler() {
        this( 'H'); //bu Class p Lİ cons
        System.out.println("MEMELİLER  p.li cons.");
    }

    public Memeliler(char y) { //char data type p li cons.
        super(34);//super class constructor call edildi.
            System.out.println("MEMELİLER p li CLASS method call");
    }

   public void mC() {
       System.out.println("mC memeliler Class methot call");
   }

    @Override
    public void mM() {
        System.out.println("mM-> Memelliler Class methot call");
    }

}//class sonu
