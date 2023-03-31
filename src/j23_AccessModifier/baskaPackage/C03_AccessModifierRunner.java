package j23_AccessModifier.baskaPackage;

import j23_AccessModifier.C01_AccessModifier;

public class C03_AccessModifierRunner {
    private String privateName = "ismail javaCAN";
    protected String protectedName = "Ceren javaTAR";
    String defaultName = "Vedat javASLAN";
    public String publicName = "sefil HalUk ";

    public static void main(String[] args) {

        C01_AccessModifier obj5 = new C01_AccessModifier(45, 77);
        System.out.println("obj5.publicYas = " + obj5.publicYas);//farklı package public variable call edildi.

        // obj5.defaultYas//farklı package public hariç(default private protected) variable call edilemez

        // obj5.protectedName//farkli package obj variable erişilemez
        // obj5.defaultName//
        // obj5.publicName//
        // obj5.privateName//
        C03_AccessModifierRunner obj6 = new C03_AccessModifierRunner();
        System.out.println("obj6.protectedName = " + obj6.protectedName);//aynı  package ve class obj variable erişilebilir
        System.out.println("obj6.defaultName = " + obj6.defaultName);//
        System.out.println("obj6.publicName = " + obj6.publicName);//
        System.out.println("obj6.privateName = " + obj6.privateName);//

    }
}