
package j20_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {
        C04_Teacher ogrt1 = new C04_Teacher();// p siz default cons.create edildi.
        ogrt1.ad="ibrahim";
        ogrt1.soyad="vesek";
        ogrt1.brans="fen bilimleri";
        ogrt1.maas=44000;
        ogrt1.tecrube=11;

        System.out.println("ogrt1 = " + ogrt1);

C04_Teacher ogrt2 = new C04_Teacher("ibrahim", "vesek", "fen bilimleri", 10,44000, 11,false);
        System.out.println("ogrt2 = " + ogrt2);


    }
}
