package j25_Inheritance.task02;

public class SubClass extends SuperClass {

    int sayi = 17;

    public static void main(String[] args) {

        SubClass obj= new SubClass();
        obj.javaCAn(); // obj ile non-static meth call edildi.
        //javaCan(); //gelmez.

    }//main

    @Override
    public String ebikKabık() {
        return "Agam SubClass'dan selam dewamkeee. ";


    }

    public void javaCAn() {
        System.out.println("this.ebikKabık() = " + this.ebikKabık()); // subClass meth.call -- child meth call
        System.out.println("super.ebikKabık() = " + super.ebikKabık()); //super class tan geldi.

        System.out.println("sayi = " + sayi);//child classtan veriable call edildi.
        System.out.println("super.sayi = " + super.sayi);// super(parent) clastaki sayi call edildi.


    }

}//class
