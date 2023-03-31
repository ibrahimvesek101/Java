package j23_AccessModifier;

import j05_ifStatementTernaryOperator.C07_NestedTernaryOperator;

import java.util.Collections;

public class C02_AccessModifierRunner {
    public static void main(String[] args) {
        // C01_AccessModifier obj1 = new C01_AccessModifier();//private cons farklı Class'dan call edilemez
        C01_AccessModifier obj1 = new C01_AccessModifier(45,34);//public olan cons. farklı Class'dan call edildi.

        C02_AccessModifierRunner obj2=new C02_AccessModifierRunner();//default p'siz cons obj2 create edildi
        System.out.println("obj1.defaultYas = " + obj1.defaultYas);
        System.out.println("obj1.protectedYas = " + obj1.protectedYas);
        System.out.println("obj1.publicYas = " + obj1.publicYas);
        obj1.protectedMethod();
        // obj1.privateYas;//private variable obj ile de olsa Calss harici erişilemezzz
        // obj1.privateMethod();//private meth obj ile de olsa Calss harici erişilemezzz
        // C01_AccessModifier.privateMethod();//private static meth ClassName ile de olsa Calss harici erişilemezz

    }
}