package j24_Encapsulation.Tasks.task02;

import java.util.Scanner;

public class Student {
    // field

    private String name;
    private int age;
    //cons.


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class StudentRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("adınızı giriniz : ");
        String ad = input.nextLine();
        System.out.print("yaşınızı giriniz : ");
        int yas = input.nextInt();

        Student ogrenci1 = new Student(ad, yas);
        System.out.println("Student name is : " + ogrenci1.getName() + "\nHe is " + ogrenci1.getAge() + " years old");


    }
}

