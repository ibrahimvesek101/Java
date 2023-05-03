package Projeler.Yeni_projeler.Project_09.School;

import org.junit.Assert;

import java.util.ArrayList;

public class SchoolLocation {

      /*
    Create 3 private instance variables
    String price and location
    Static String ArrayList locationList
     */


     /*
     3 private instance variables oluşturun
    String price and location
    Static String ArrayList locationList
     */

    private String price;
    private String location;
    private static ArrayList<String> locationList = new ArrayList<>();


    //-------------------------------------------------------------------------------------------------------

    /*
    Create a constructor
        Parameter string location

        call three methods

        addLocation
        setSchoolLocation
        setPrice
     */

     /*

        Parametresi string location olan constructor oluşturun

        üç methodu çağırın

        addLocation
        setSchoolLocation
        setPrice
     */

    public SchoolLocation(String location) {
        this.location = location;

        addLocation();
        setSchoolLocation(location);
        setPrice();
    }


    //-------------------------------------------------------------------------------------------------------



    /*
    create a setPrice Method

            if the location is USA
                price should be $8000
            if the location is England
                price should be $6500
            if the location is France
                price should be $7200
            if the location is Germany
                price should be $7000
            if the location is Canada
                price should be $7500

            if the location is non of these then throw an exception  --> "This is not a valid location"

     */


  /*
             setPrice Methodunu oluşturun

            Eğer location  USA ise
                price  $8000 olmalı
            Eğer location  England ise
                price  $6500 olmalı
           Eğer location  France ise
                price  $7200 olmalı
            Eğer location  Germany ise
                price  $7000 olmalı
           Eğer location  Canada ise
                price  $7500 olmalı

            Eğer location bunlardan biri değil ise   exception fırlatın  --> "This is not a valid location"

     */

    void setPrice() throws RuntimeException {

        if (location.equals("USA")) {
            this.price = "$8000";
        } else if (location.equals("England")) {
            this.price = "$6500";
        } else if (location.equals("France")) {
            this.price = "$7200";
        } else if (location.equals("Germany")) {
            this.price = "$7000";
        } else if (location.equals("Canada")) {
            this.price = "$7500";
        } else {
            throw new RuntimeException("This is not a valid location");
        }

    }


    //-------------------------------------------------------------------------------------------------------

    /*
    Create a get method for price
     */


     /*
    price için get methodu oluşturun
     */

    public String getPrice() {
        return price;
    }

    //-------------------------------------------------------------------------------------------------------
      /*
    Create a public static method name is addLocation
        no return type
        add USA , England , France , Germany , Canada
             to
        ArrayList locationList
     */


     /*
        return türü olmayan addLocation isminde  public static methodunu oluşturun

        ArrayList locationList'e   USA , England , France , Germany , Canada  ekle
     */

    public static void addLocation() {

        locationList.add("USA");
        locationList.add("England");
        locationList.add("France");
        locationList.add("Germany");
        locationList.add("Canada");


    }


    //-------------------------------------------------------------------------------------------------------

    /*
    Create a get method for the locationList
     */

    /*
     locationList için get methodunu oluşturun
     */

    public static ArrayList<String> getLocationList() {
        return locationList;
    }

    //-------------------------------------------------------------------------------------------------------

       /*
    Create a set method for the locationList
    no return type
    one parameter String SchoolLocation
    Create an String ArrayList name is listOfLocations is equal to the get method of the locationList

    If the locationList contains SchoolLocation
    then instance variable location is equal to  SchoolLocation parameter

     If the locationList does NOT contains SchoolLocation parameter
     then throw a RunTimeException ("Location should be one of the following " +listOfLocations)
     */


      /*

    parametresi  String SchoolLocation ve return türü olmayan locationList methodunu oluşturun

    Create an String ArrayList name is listOfLocations is equal to the get method of the locationList

     locationList'in get methoduna eşit olan listOfLocations adında bir String ArrayList oluşturun

    Eğer locationList  SchoolLocation içeriyorsa
    then instance variable location  SchoolLocation parametreye eşittir.

     Eğer locationList  SchoolLocation içermiyorsa
      RunTimeException fırlat ---> ("Location should be one of the following " +listOfLocations)
     */


    public void setSchoolLocation(String SchoolLocation) {

        ArrayList<String> listOfLocations = getLocationList();

        if (locationList.contains(SchoolLocation)) {
            this.location = SchoolLocation;
        } else {
            Assert.fail("Location should be one of the following " + listOfLocations);
            //          throw new RuntimeException("Location should be one of the following " + listOfLocations);

        }
    }


    //-------------------------------------------------------------------------------------------------------
    /*
    Create a get method for the location
     */

    /*
     location için get methodu oluşturun
     */


    public String getLocation() {
        return location;
    }


}
