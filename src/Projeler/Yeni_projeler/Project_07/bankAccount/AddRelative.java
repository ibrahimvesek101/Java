package Projeler.Yeni_projeler.Project_07.bankAccount;

public class AddRelative {

    /*
    Create an instance variable
        String fullName , age
     */
    //--------------------------------------------------------------------------------------------------
    String fullName;
    String age;


    //--------------------------------------------------------------------------------------------------
    /*
        Create a constructor AddRelative
            parameters String fullName and age

        instance variable fullName equal to parameter fullName

        If the age is more then or equal to 18 then instance variable age equal to parameter age (use relativeAgeChecker method)
        If the age is less then 18 then instance variable age equal to "0"

     */

    /*
        String fullName ve age olan AddReative  parametresi olan constructorunu oluşturun


        instance variable fullName eşittir parameter fullName' e

        Eğer age 18 e eşit veya büyük ise  instance variable age eşittir  parameter age (use relativeAgeChecker method) e.
         Eğer age 18 den küçük ise instance variable age eşittir "0"  .

     */
    //--------------------------------------------------------------------------------------------------

    public AddRelative(String fullName, String age) {
        this.fullName = fullName;

        boolean b = relativeAgeChecker(age);
        if (b == true) {
            this.age = age;
        }
        if (b == false) {
            this.age = "0";
        }


    }


    //--------------------------------------------------------------------------------------------------

    /*
        Create a method name is relativeAgeChecker
        parameter String(relativeAge)
        return type is boolean

        if the relativeAge more or equal to 18 then return true
        else false

        Note: use a Users class checkAge method.
     */

    public boolean relativeAgeChecker(String relativeAge) {

        String str = Users.checkAge(relativeAge);

        if (str.equals("You can get a credit card")) {
            return true;
        }
        return false;
    }







    /*
       ---Parametresi String relativeAge ve return tipi boolean olan
          relativeAgeChecker  methodunu oluşturun
       --- Eğer relativeAge 18 den büyük veya eşit ise true return et
           aksi halde false return et

       Not :  Users class checkAge methodunu kullan


     */
    //--------------------------------------------------------------------------------------------------


}
