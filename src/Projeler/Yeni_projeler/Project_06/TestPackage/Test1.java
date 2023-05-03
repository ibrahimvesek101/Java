package Projeler.Yeni_projeler.Project_06.TestPackage;



import Projeler.Yeni_projeler.Project_06.Item.Items;
import Projeler.Yeni_projeler.Project_06.Settings.Address;
import Projeler.Yeni_projeler.Project_06.Settings.UserNameAndPassword;
import Projeler.Yeni_projeler.Project_06.Settings.UserSettings;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test1 {

    @Before
    public void beforeMethod(){
        UserNameAndPassword userPassword = new UserNameAndPassword();
        userPassword.addUserToList();

        Address address = new Address();
        address.SetCity();
    }

    @Test
    public void test1(){

        UserSettings userSettings = new UserSettings();

        userSettings.username = "Jerremy@gmail.com";
        userSettings.password = "123456789";
        userSettings.Address1 = "123 main";
        userSettings.City = "New York";
        userSettings.ZipCode = "12345";
        userSettings.ItemName = "Monitor";
        userSettings.color = "Red";
        userSettings.wanaCustomText = true;
        userSettings.customText = "I love Monitor";
        userSettings.myPrice = 0;

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword(userSettings.username , userSettings.password);

        Address address = new Address();

        address.Address1(userSettings.Address1 );
        address.City(userSettings.City );
        address.ZipCode(userSettings.ZipCode);

        Items items = new Items();
        items.ItemName(userSettings.ItemName);
        items.colorPrice(userSettings.color);
        userSettings.myPrice = items.customText( userSettings.wanaCustomText , userSettings.customText);

        items.AddtoAllUserPrice();

        System.out.println(userSettings);

        UserSettings userSettings2 = new UserSettings();

        userSettings2.username = "Jerremy2@gmail.com";
        userSettings2.password = "Ccccccccccc";
        userSettings2.Address1 = "123 main";
        userSettings2.City = "Atlanta";
        userSettings2.ZipCode = "66443";
        userSettings2.ItemName = "Rose teddy bear";
        userSettings2.color = "Blue";
        userSettings2.wanaCustomText = true;
        userSettings2.customText = "for u";
        userSettings2.myPrice = 0;

        UserNameAndPassword userNameAndPassword2 = new UserNameAndPassword(userSettings2.username , userSettings2.password);


        Address address2 = new Address();
        address2.Address1(userSettings2.Address1 );
        address2.City(userSettings2.City );
        address2.ZipCode(userSettings2.ZipCode);

        Items items2 = new Items();
        items2.ItemName(userSettings2.ItemName);
        items2.colorPrice(userSettings2.color);

        userSettings2.myPrice = items2.customText( userSettings2.wanaCustomText , userSettings2.customText);
        items2.AddtoAllUserPrice();
        System.out.println(userSettings2);

        System.out.println(Items.getAllUserPrice());

    }

    @Test
    public void test2(){

        UserSettings userSettings3 = new UserSettings();

        userSettings3.username = "Jerremy3@gmail.com";
        userSettings3.password = "86444fddddfe";
        userSettings3.Address1 = "1 Second";
        userSettings3.City = "New Jersey";
        userSettings3.ZipCode = "00981";
        userSettings3.ItemName = "Monitor";
        userSettings3.color = "White";
        userSettings3.wanaCustomText =false;
        userSettings3.customText = "";
        userSettings3.myPrice = 0;

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword(userSettings3.username , userSettings3.password);


        Address address = new Address();

        address.Address1(userSettings3.Address1 );
        address.City(userSettings3.City );
        address.ZipCode(userSettings3.ZipCode);

        Items items = new Items();
        items.ItemName(userSettings3.ItemName);
        items.colorPrice(userSettings3.color);
        userSettings3.myPrice = items.customText( userSettings3.wanaCustomText , userSettings3.customText);

        items.AddtoAllUserPrice();

        System.out.println(userSettings3);

        UserSettings userSettings4 = new UserSettings();

        userSettings4.username = "Jerremy4@gmail.com";
        userSettings4.password = "asdadadasd";
        userSettings4.Address1 = "3099 glass street";
        userSettings4.City = "Pennsylvania";
        userSettings4.ZipCode = "99212";
        userSettings4.ItemName = "mug";
        userSettings4.color = "Blue";
        userSettings4.wanaCustomText = true;
        userSettings4.customText = "Happy Birthday";
        userSettings4.myPrice = 0;

        UserNameAndPassword userNameAndPassword2 = new UserNameAndPassword(userSettings4.username , userSettings4.password);



        Address address2 = new Address();
        address2.Address1(userSettings4.Address1 );
        address2.City(userSettings4.City );
        address2.ZipCode(userSettings4.ZipCode);

        Items items2 = new Items();
        items2.ItemName(userSettings4.ItemName);
        items2.colorPrice(userSettings4.color);

        userSettings4.myPrice = items2.customText( userSettings4.wanaCustomText , userSettings4.customText);
        items2.AddtoAllUserPrice();
        System.out.println(userSettings4);

        System.out.println(Items.getAllUserPrice());

    }

    @Test
    public void test3(){

        UserSettings userSettings5 = new UserSettings();

        userSettings5.username = "Jerremy5@gmail.com";
        userSettings5.password = "!!!!!!!!!!!!!!!";
        userSettings5.Address1 = "12 Java street";
        userSettings5.City = "Ohio";
        userSettings5.ZipCode = "11223";
        userSettings5.ItemName = "charger";
        userSettings5.color = "Black";
        userSettings5.wanaCustomText =false;
        userSettings5.customText = "";
        userSettings5.myPrice = 0;

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword(userSettings5.username , userSettings5.password);


        Address address = new Address();

        address.Address1(userSettings5.Address1 );
        address.City(userSettings5.City );
        address.ZipCode(userSettings5.ZipCode);

        Items items = new Items();
        items.ItemName(userSettings5.ItemName);
        items.colorPrice(userSettings5.color);
        userSettings5.myPrice = items.customText( userSettings5.wanaCustomText , userSettings5.customText);

        items.AddtoAllUserPrice();

        System.out.println(userSettings5);

        UserSettings userSettings6 = new UserSettings();

        userSettings6.username = "Jerremy6@gmail.com";
        userSettings6.password = "asdadadasd";
        userSettings6.Address1 = "2496 spindlehill drive";
        userSettings6.City = "Washington";
        userSettings6.ZipCode = "99212";
        userSettings6.ItemName = "Iphone max";
        userSettings6.color = "Red";
        userSettings6.wanaCustomText = true;
        userSettings6.customText = "I am coming home";
        userSettings6.myPrice = 0;

        UserNameAndPassword userNameAndPassword2 = new UserNameAndPassword(userSettings6.username , userSettings6.password);



        Address address2 = new Address();
        address2.Address1(userSettings6.Address1 );
        address2.City(userSettings6.City );
        address2.ZipCode(userSettings6.ZipCode);

        Items items2 = new Items();
        items2.ItemName(userSettings6.ItemName);
        items2.colorPrice(userSettings6.color);

        userSettings6.myPrice = items2.customText( userSettings6.wanaCustomText , userSettings6.customText);
        items2.AddtoAllUserPrice();
        System.out.println(userSettings6);

        System.out.println(Items.getAllUserPrice());

    }

    @AfterClass
    public static void AfterClass(){

        Items item = new Items();
        Assert.assertTrue("Result should be 1163.68 but your result is " + item.getAllUserPrice(),1163.68==item.getAllUserPrice());

    }

}
