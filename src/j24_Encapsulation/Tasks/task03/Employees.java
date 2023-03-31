package j24_Encapsulation.Tasks.task03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employees {//outher Class level

    //fields..
    private String  name;
    private int salary;
    private String dob;
//constructor..

    public Employees(String name, int salary, String dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }
    // task method...
    public int ageCalculator(){//yaş return eden method
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Period.between(LocalDate.parse(dob,dtf), LocalDate.now()).getYears();
    }
    public String  yasKontrol(){
        if (ageCalculator()>18) {
            return "Welcome to our company "+name+" your salary is "+salary;
        } else if (ageCalculator()<18) {
            return "come back when you are 18 years old";
        }else return  "we can have inter with you after that you can have a "+ salary+" salary";
    }

        // getters and setters..

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    //toString method..

    @Override
    public String toString() {
        return yasKontrol();
    }
}//outher class sonu
class  Runner {//inner class level

    public static void main(String[] args) {

        Employees obj1 = new Employees("Abdi", 100000, "08/10/1978");
        System.out.println("obj1 = " + obj1);//obj1 = Welcome to our company Abdi your salary is 100000

        Employees obj2 = new Employees("sefil Haluk", 5000, "09/03/2005");
        System.out.println("obj2 = " + obj2);//we can have inter with you after that you can have a 5000 salary
    }

}//inner class sonu