package j25_Inheritance.inheritance02;

public class Hayvancık {// G parent-super (dede) Class
    int a;  //instance variable
    int m=3; //instance variable int type



    public Hayvancık() { // p.siz cons.
        System.out.println("HAYVANCIK  p.siz cons.");
    }

    public Hayvancık(int x) {
        System.out.println("HAYVANCIK  p.li cons.");

    }
    public void mA(){
        System.out.println("mA -> HAYVANCIK CLASS method call..");
    }
    public void mM(){
        System.out.println("mM -> HAYVANCIK CLASS method call..");
    }

}
