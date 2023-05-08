package Projeler.Yeni_projeler.Project_06.Settings;

import java.util.ArrayList;

public class UserNameAndPassword {

    /*
        DO NOT CHANGE THE addUserToList METHOD

        addUserToList is adding default email address to the UserNameLists

     */

    /*
         addUserToList METHODUNU değiştirmeyin

        addUserToList UserNameLists a   default email address ekliyor

     */


    public void addUserToList() {
        UserNameLists.add("Steven@gmail.com");
        UserNameLists.add("James@hotmail.com");
        UserNameLists.add("David@gmail.com");
        UserNameLists.add("Jerry@hotmail.com");
        UserNameLists.add("Emily@yahoo.com");
        UserNameLists.add("Barbara@gmail.com");
    }


    /*
        Given constructor. Parameter is String Username , String Password. This constructor calling the setUsername and setPassword methods.

     */


    /*

     Parametresi String Username ve String Password olan  bu constructor SetUsername ve setPassword methodlarını çağıran bu constructordır.

    */

    public UserNameAndPassword(String Username, String Password) {
        setUsername(Username);
        setPassword(Password);
    }

    /*
        Given default constructor.
     */

    public UserNameAndPassword() {

    }

    /*
       Create a private String userName and password

       Create a Arraylist . Arraylist type should be String. ArrayList should be static . Name is UserNameLists

    */



    /*
       private String userName and password oluştur

     Adı UserNameLists , türü Strıng ve static olan bir  Arraylist oluşturun.

    */





    //TODO also need to initialize my arraylist
    // TODO   my arraylist initialize et
    private String userName, password;
    public static  ArrayList<String> UserNameLists = new ArrayList<>();


    /*
        Create a method name is setUsername
        return type is String
        parameter is String(myUsername)

        if the myUsername length is less then 6
        return Username length should be more then 6

        if the myUsername contains space(" ")
        return  Username should not contain space

        if the myUsername does NOT contains @
        return Username should contain @ symbol

        if the UserNameLists has myusername
        return Username should be unique

        if all these are false
        private userName = myUsername

        and return the username
    */


    /*
       türü String ve parametresi String(myUsername) olan
       setUsername adında bir method oluşturun

       Eğer myUsername length 6 dan küçük ise
       Username length should be more then 6 return et.

        Eğer myUsername boşluk(" ") içeriyorsa
        Username should not contain space return et

        Eğer myUsername  @ sembolü içermiyorsa
        Username should contain @ symbol return et

        Eğer UserNameLists de  myusername varsa
        Username should be unique return et

        Eğer bunların hepsi false ise
       private userName = myUsername

       ve userName return et
   */
    public String setUsername(String myUsername) {
        if (myUsername.length() < 6) {
            return "Username length should be more then 6";
        }
        if (myUsername.contains(" ")) {
            return "Username should not contain space";
        }
        if (!myUsername.contains("@")) {
            return "Username should contain @ symbol";
        }
        if (myUsername.equalsIgnoreCase(myUsername)) {
            return "Username should be unique";
        }
        this.userName = myUsername;

        return this.userName;
    }


    /*
    Create a method name is setPassword
    Return type is String
    Parameter is String(myPassword)

    if myPassword length is less or equal then 5
    return  Password length more then 5 character

    if first condition is false
    private password variable is equal to myPassword

    and return the myPassword

     */



 /*
    Return türü String ve parametresi String(myPassword) olan setPassword methodunu oluşturun



    Eğer myPassword length  5 ten küçük veya eşit ise
     Password length more then 5 character  return edin

    Eğer ilk condition false ise
    private password variable  myPassword a eşittir

    ve   myPassword return et

     */

    public String setPassword(String myPassword) {
        if (myPassword.length() <= 5) {
            return "Password length more then 5 character";
        }
        this.password = password;

        return myPassword;
    }
}
