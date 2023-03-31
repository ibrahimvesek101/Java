package j22_Scope;

public class C03_Scope {//Class level

    public static void main(String[] args) {//main level
        C01_InstanceVariable obj1 = new C01_InstanceVariable();//istediğim Class'Dan cons call edilerek obj cretae edilebilir

        C02_StaticVariable obj2 = new C02_StaticVariable();//istediğim Class'Dan cons call edilerek obj cretae edilebilir
        obj1.non_static_method();//non_static_method obj ile call edilir
        C01_InstanceVariable.static_method();//static_method ClassName ile call ed
        obj1.developerMi = true;//inst variable obj ile call edildi.
        System.out.println("obj1.developerMi = " + obj1.developerMi);
        System.out.println("C01_InstanceVariable.kurs = " + C01_InstanceVariable.kurs);//static variable obj ile değil CalssName ile call edildi

    }//main sonu
}//Class sosnu