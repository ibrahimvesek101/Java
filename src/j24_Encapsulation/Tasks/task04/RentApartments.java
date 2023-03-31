
package j24_Encapsulation.Tasks.task04;

public class RentApartments {//outher Clas level
    //fields..
    private String name;
    private int roomCount;
    private boolean balconyOrNo;

    // constructor..
    public RentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }
    // task methods...
    private int rent;
    public  int rentCalculator() {
        if (roomCount == 0) {
            this.rent=1400;
        }else if (roomCount == 1) {
            this.rent=1700;
        }else if (roomCount == 2) {
            this.rent=2200;
        }else if (roomCount == 3) {
            this.rent=2700;
        }
        return this.rent+=getBalconyOrNo();

    }
    public int getBalconyOrNo() {
        if(balconyOrNo ==true) {
            return 200;
        }else  return 0;
    }

        //getter setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

        //toString method

    @Override
    public String toString() {
        return
                "'kiracı adı='" + name + '\'' +
                        ", oda sayısı=" + roomCount +
                        ", balconyOrNo=" + balconyOrNo +", toplam kiranız : "+
                        rentCalculator();
    }
}//outher Clas sonu

class RunnerRentApartments {//inner Class level

    public static void main(String[] args) {
        RentApartments obj1=new RentApartments("QA tester Murat bey",3,true);
        System.out.println("obj1 = " + obj1);//obj1 = 'kiracı adı='QA tester Murat bey', oda sayısı=3, balconyOrNo=true, toplam kiranız : 2900
    }

}//inner Class sonu
