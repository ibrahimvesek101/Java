package j27_Abstract.abstract03;

public abstract class Sekil {   // abstract parent
    String name;

    public abstract double alan();
    public abstract double cevre();

    @Override
    public String toString() {
        return
                "name='" + name + "" +
                        "\nAlan= "+this.alan()+"" +
                        "\nCevre= "+this.cevre();
    }
    public void ciz(){ //concrete method.
        System.out.println(this.name + " çizildi.");
    }

    public String getName(){ //ismi bir daha bu method ile çağırmak anlamsız oldu ama task öyle istiyor.

        return this.name;
    }
}
