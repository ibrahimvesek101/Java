package j27_Abstract.abstract03;

public class Cember extends Sekil {
    double yariCap;
    final double pi=3.14;
    @Override
    public double alan() {  //cemberin alanı olmaz ama idare et. daire kabul et.

        return pi*yariCap*yariCap;
    }

    @Override
    public double cevre() {
        return 2*pi*yariCap;
    }
}
