package Projeler.Yeni_projeler.Project_04.dosSolution;

public class ElectricityAccount {

    double totalWph;
    double rate = 0.7;
    double bill;

    public double calculateBill(){
        if(totalWph > 0){
            bill = totalWph * rate;

            return bill;
        }else{
            System.out.println("You did not consume any energy, green world forever!!!");
            return 0.0;
        }

    }

}
