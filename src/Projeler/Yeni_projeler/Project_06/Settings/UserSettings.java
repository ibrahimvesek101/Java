package Projeler.Yeni_projeler.Project_06.Settings;

public class UserSettings {

    /*
    All variables public
    Strings are   username
                  password
                  Address1
                  City
                  ZipCode
                  ItemName
                  customText
                  color

    boolean       wanaCustomText
    double        myPrice

     */

    /*
   Bütün variables lar  public
   Stringler   username
                 password
                 Address1
                 City
                 ZipCode
                 ItemName
                 customText
                 color

   boolean       wanaCustomText
   double        myPrice

    */
    public String username,
            password,
            Address1,
            City,
            ZipCode,
            ItemName,
            customText,
            color;

    public boolean wanaCustomText;
    public double myPrice;

    /*

     Create a toString method
         return all the variables like

                "\nusername : " + username +
                "\npassword :" + password +
                "\nAddress1 " + Address1+
                 ........

     */


    /*

         toString methodunu oluşturun
         Bütün variables ları aşağıdaki gibi return et

                "\nusername : " + username +
                "\npassword :" + password +
                "\nAddress1 " + Address1+
                 ........

     */
    @Override
    public String toString() {
        return
                "\nusername :" + username  +
                "\npassword :" + password +
                "\nAddress1 :" + Address1 +
                "\nCity :" + City +
                "\nZipCode :" + ZipCode +
                "\nItemName :" + ItemName +
                "\ncustomText :" + customText +
                "\ncolor :" + color  +
                "\nwanaCustomText :" + wanaCustomText +
                "\nmyPrice :" + myPrice ;
    }
}
