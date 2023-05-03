package Projeler.Yeni_projeler.Project_06.Item;

public class Items {

    /*
    Create an Instance variables
      private double price
      private static double allUserPrice

     */

     /*
      Instance variables oluştur
      private double price
      private static double allUserPrice

     */

    private double price;
    private static double allUserPrice;

    /*
        Create a method name is ItemName
        Return type is void
        Parameter is String(myItem)

        NOTE : USE SWITCH STATEMENT

        if my item = Rose teddy bear
            add 30 to price variable

        if my item = Iphone max
            add 850.23 to price variable

         if my item = laptop mouse
            add 23.50 to price variable

         if my item = Monitor
            add 90.23 to price variable

          if my item = charger
            add 43.20 to price variable

         if my item = hdmi cable
            add 5.90 to price variable

         if my item = mug
            add 15.79 to price variable

     */


    /*
        ItemName methodunu oluştur
        Return türü void
        Parameter  String(myItem)  olsun

        NOT:  SWITCH STATEMENT KULLAN

        Eğer myItem = Rose teddy bear ise
        price variable 30 ekle

        Eğer myItem = Iphone max   ise
         price variable 850.23 ekle

         Eğer myItem = laptop mouse   ise
         price variable 23.50 ekle

         Eğer myItem = Monitor  ise
         price variable 90.23 ekle

          Eğer myItem = charger ise
          price variable 43.20 ekle

         Eğer myItem = hdmi cable  ise
         price variable 5.90 ekle

         Eğer my item = mug  ise
         price variable 15.79 ekle

     */
    public void ItemName(String myItem){
        switch (myItem){
            case "Rose teddy bear":
                price+=30;
                break;
            case "Iphone max":
                price+=850.23;
                break;
            case "laptop mouse":
                price+=23.50;
                break;
            case "Monitor":
                price+=90.23;
                break;
            case "charger":
                price+=43.20;
                break;
            case "hdmi cable":
                price+=5.90;
                break;
            case "mug":
                price+=15.79;
                break;
        }
    }

    /*
        Create a method name is colorPrice
        Return type is void
        Parameter is String(color)

        NOTE : USE SWITCH STATEMENT

           if color = Red
            add 10 to price variable

           if color = Blue
            add 6 to price variable

           if color = Black
            add 4 to price variable

           if color = White
            add 2 to price variable
     */

    /*
        colorPrice methodunu oluştur
        Return türü void
        Parameter  String(color) olmalı

        NOT : SWITCH STATEMENT KULLAN

           Eğer color = Red  ise
           price variable  10 ekle

          Eğer color = Blue   ise
          price variable 6 ekle

           Eğer color = Black   ise
           price variable  4 ekle

           Eğer color = White  ise
            price variable  2 ekle
     */

    public void colorPrice(String color){
        switch (color){
            case "Red":
                price+=10;
                break;
            case "Blue":
                price+=6;
                break;
            case "Black":
                price+=4;
                break;
            case "White":
                price+=2;
                break;
        }
    }



    /*
    Create a method name is customText
    return type is double
    parameters are  one boolean and one String

    if boolean true and String length is more then 10
        add 5 to price variable

    if boolean true and String length is more then or equal to 10
        add 3 to price variable

     */



    /*
   customText methodunu oluştur
   return türü double
   parametreler bir tane boolean ve bir tane  String olmalı

   Eğer boolean true ve  String length 10 dan büyük ise
   price variable 5 ekle

   Eğer boolean true ve String length 10 dan büyük veya 10 a eşit ise
        price variable 3 ekle

    */
    //TODO what should I return? , typo then*, second condition is redundant why need to check >= ???
    public double customText(boolean b, String s){
        if(b && s.length() > 10){
            price+=5;
        }
        if(b && s.length() >= 10){
            price+=3;
        }

        return price;
    }


    /*
        Create a method name is AddtoAllUserPrice
        return type is void
        no parameter

        add price to allUserPrice

     */


    /*
       AddtoAllUserPrice methodunu oluşturun
       return türü  void
       parametresiz olmalı

       allUserPrice a price ekle

    */
    public void AddtoAllUserPrice(){
        allUserPrice+=price;
    }


    /*
        Create a static method name is getAllUserPrice
        return type is double
        no parameter

         allUserPrice   return edin
     */


    /*
       getAllUserPrice methodunu oluşturun
       return türü double
       parametresiz olmalı

       allUserPrice return edin
    */
    public static double getAllUserPrice(){
        return allUserPrice;
    }




}
