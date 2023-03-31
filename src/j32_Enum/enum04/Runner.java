package j32_Enum.enum04;

public class Runner {
    public static void main(String[] args) {


        Aylar ay = Aylar.MAYIS;
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());
        System.out.println("ay.gunSayisi = " + ay.gunSayisi);
        ay.gunMiktari();
    }
}