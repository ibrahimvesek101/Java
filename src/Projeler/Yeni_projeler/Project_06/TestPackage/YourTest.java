package Projeler.Yeni_projeler.Project_06.TestPackage;


import Projeler.Yeni_projeler.Project_06.Settings.UserNameAndPassword;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.Principal;
import java.util.ArrayList;

import static Projeler.Yeni_projeler.Project_06.Settings.UserNameAndPassword.UserNameLists;

public class YourTest {

    /*
        Given before class

              Do not change the before class
    */

    /*
        before class verilmiştir

        before class değiştirmeyin
   */
    @Before
    public void beforeClass() {

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        userNameAndPassword.addUserToList();

    }

    /*

    YOUR CODE IS STARTING HERE

    Test the UserNameAndPassword class setUsername method

    Check all the possible options.

    NOTE :  For each possibility you need to create a different @Test method

     */


    /*

  KOD BURDAN BAŞLIYOR

   UserNameAndPassword class setUsername method TEST EDİN

  Bütün ihtimalleri check edin

  NOTE :  Her ihtimal için farklı @Test method oluşturmanız gerekiyor

   */
    @Test()
    public void testNameLenght() {
        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        String nameLenght = userNameAndPassword.setUsername("ali");

        Assert.assertEquals("Username length should be more then 6", nameLenght);
    }

    @Test
    public void testNameContainsSpeace() {
        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        String nameContainsSpeace = userNameAndPassword.setUsername("ib ra him");

        Assert.assertEquals("Username should not contain space", nameContainsSpeace);
    }

    @Test
    public void testNameNotContainsSembol() {
        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        String nameNotContainsSembol = userNameAndPassword.setUsername("ibrahim");

        Assert.assertEquals("Username should contain @ symbol", nameNotContainsSembol);
    }

    @Test
    public void testUserNameListsHasMyusername() {
        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        String userNameListsHasMyusername = userNameAndPassword.setUsername("ibrahim");

        UserNameLists.add(userNameListsHasMyusername);

        boolean nameListControl = UserNameLists.contains(userNameListsHasMyusername);

        Assert.assertTrue("Username should be unique ",nameListControl);

    }


}
