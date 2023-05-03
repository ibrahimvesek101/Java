package Projeler.Yeni_projeler.Project_04.example;

public class ElectricityAccount {
    double totalWph;
    double rate = 0.7;
    static double bill;

    public double calculate(){

        bill += rate * totalWph;

        return bill;

    }



}
