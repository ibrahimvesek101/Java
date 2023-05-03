package Projeler.Yeni_projeler.Project_08.Mortgage;

public class HousePrices extends Users {

    private int price;

    public HousePrices(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        super(username, whichCondition, houseType, roomCount, downPayment, longTerm, statesTax);

    }

    /*
            This class is extending the Users class

            1 private int variable price

     */

      /*
           Bu class  Users clasından miras alıyor

            1 private int variable price

     */
//---------------------------------------------------------------------------------------------------------


//---------------------------------------------------------------------------------------------------------
    /*
        Create a method name is roomCountToPrice
        no parameter
        no return type

        if the roomCount in the Users class equal to 0
            add 10000 to price
        if the roomCount in the Users class equal to 1
            add 20000 to price
        if the roomCount in the Users class equal to 2
            add 30000 to price
        if the roomCount in the Users class equal to 3
            add 40000 to price
        if the roomCount in the Users class equal to 4
            add 50000 to price
        if the roomCount in the Users class equal to 5
            add 60000 to price


     */

    /*
        roomCountToPrice isimli bir method oluştur
        no parameter
        no return type

        Eğer  Users class içindeki roomCount 0 a eşitse
            price a 10000 ekle
        Eğer  Users class içindeki roomCount 1 e eşitse
            price a 20000 ekle
        Eğer  Users class içindeki roomCount 2 ye eşitse
            price a 30000 ekle
       Eğer  Users class içindeki roomCount 3 e eşitse
            price a 40000 ekle
       Eğer  Users class içindeki roomCount 4 e eşitse
            price a 50000 ekle
        Eğer  Users class içindeki roomCount 5 e eşitse
            price a 60000 ekle


     */
//---------------------------------------------------------------------------------------------------------
    public void roomCountToPrice() {
        if (getRoomCount() == 0) {
            price += 10000;
        } else if (getRoomCount() == 1) {
            price += 20000;
        } else if (getRoomCount() == 2) {
            price += 30000;
        } else if (getRoomCount() == 3) {
            price += 40000;
        } else if (getRoomCount() == 4) {
            price += 50000;
        } else if (getRoomCount() == 5) {
            price += 60000;
        }
    }


//---------------------------------------------------------------------------------------------------------

    /*
        Create a method name is ConditionToPrice
        no parameter
        no return type

            if WhichCondition variable in the Users class equal to new
                add 50000 to price
            if WhichCondition variable in the Users class equal to like new
                add 40000 to price
            if WhichCondition variable in the Users class equal to old
                add 30000 to price
            if WhichCondition variable in the Users class equal to Renew Required
                add 15000 to price

     */

    /*
     ConditionToPrice isimli bir method oluştur
      no parameter
      no return type

      Eğer  Users class içindeki WhichCondition variable new'e eşitse
      price a 50000 ekle
      Eğer  Users class içindeki WhichCondition variable like new'e eşitse
      price a 40000 ekle
      Eğer  Users class içindeki WhichCondition variable old'a eşitse
      price a 30000 ekle
      Eğer  Users class içindeki WhichCondition variable Renew Required'a eşitse
      price a 15000 ekle
     */
    //---------------------------------------------------------------------------------------------------------
    public void ConditionToPrice() {

        if (getWhichCondition().equals("new")) {
            price += 50000;
        } else if (getWhichCondition().equals("like new")) {
            price += 40000;
        } else if (getWhichCondition().equals("Old")) {
            price += 30000;
        } else if (getWhichCondition().equals("Renew Required")) {
            price += 15000;
        }
    }


    //---------------------------------------------------------------------------------------------------------

    /*
        Create a method name is houseTypeToPrice
        no parameter
        no return type
            if HouseType is equal to Apartment
                add 20000 to price
            if HouseType is equal to condo
                add 30000 to price
            if HouseType is equal to house
                add 40000 to price

     */

    /*
        houseTypeToPrice isimli bir method oluştur
        no parameter
        no return type

        Eğer HouseType Apartment e eşitse
         price a 20000 ekle
         Eğer HouseType condo ya eşitse
         price a 30000 ekle
         Eğer HouseType house e eşitse
         price a 40000 ekle
     */
    //---------------------------------------------------------------------------------------------------------

    public void houseTypeToPrice() {

        if (getHouseType().equals("Apartment")) {
            price += 20000;
        } else if (getHouseType().equals("condo")) {
            price += 30000;
        } else if (getHouseType().equals("House")) {
            price += 40000;
        }
    }


    //---------------------------------------------------------------------------------------------------------


    /*
            Create a method name is getPriceTotal
            return type is int
            Return the total price(housetype, condition and roomcount prices)
            Also you need to calculate the tax and add  to the price
            For the tax percentage use the StatesTax enum
     */

     /*
        getPriceTotal isimli bir method oluştur
        return türü int olsun
        total price return et(housetype, condition ve roomcount price lar)
        Ayrıca tax hesaplayıp price a eklemeniz gerekiyor
        tax yüzdesi için StatesTax enum kullanınız
      */

    //---------------------------------------------------------------------------------------------------------

    public int getPriceTotal() {

        houseTypeToPrice();
        ConditionToPrice();
        roomCountToPrice();
        price += (price * (getStatesTax().getTax())) / 100;
        return price;
    }


    //---------------------------------------------------------------------------------------------------------


    /*
        Create a method name is getPriceEachMonth

            Return the monthly payment amount.
            reduce the downpayment and calculate the each month's payment
     */

     /*
        getPriceEachMonth isimli bir method oluştur

        monthly payment amount return et
        downpayment azalttıktan sonra LongTerm e bölerek ve her ayın payment'ini hesaplayın
     */
    //---------------------------------------------------------------------------------------------------------

    public int getPriceEachMonth() {

        int amount = (price - getDownPayment()) / getLongTerm();


        return amount;

    }


    //---------------------------------------------------------------------------------------------------------

}




