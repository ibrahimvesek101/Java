package Projeler.Yeni_projeler.Project_07.TestClasses;


import Projeler.Yeni_projeler.Project_07.bankAccount.Users;
import org.junit.Assert;
import org.junit.Test;


public class yourTest {

    /*
        Create a Test for method in the Users randomNumberCreader

        Check all possible options
     */


    /*
         Users içindeki randomNumberCreader methodu için Test oluştur

        Tüm olası seçenekleri kontrol edin
     */

    @Test

    public void testRandomNumberCreader() {

        int actual = Users.randomNumberCreader();

        Assert.assertTrue(actual > 10000000 && actual <= 99999999);

    }







    /*
          Users içindeki checkAge için Test oluştur

        Tüm olası seçenekleri kontrol edin

     */

    @Test

    public void testCheckAge1() {

        String result = Users.checkAge("06/16/2000");

        String expected = "You can get a credit card";

        Assert.assertEquals(expected, result);

    }

    @Test

    public void testCheckAge2() {

        String result = Users.checkAge("06/16/2010");

        String expected = "You should be at least 18 years old to get a credit card.";

        Assert.assertEquals(expected, result);
    }
}