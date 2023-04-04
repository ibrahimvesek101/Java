package A_Deneme;

public abstract class Insan {

String gozRengi="";
Double kilo;
Double boy;


    public static void InsanMethod(){
        System.out.println("her insan islam fıtratı üzerine doğar.");
    }

    public Insan(String gozRengi, Double kilo, Double boy) {
        this.gozRengi = gozRengi;
        this.kilo = kilo;
        this.boy = boy;
    }
}

