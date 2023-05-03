package Projeler.Yeni_projeler.Project_09.Lessons;


import Projeler.Yeni_projeler.Project_09.Student.StudentClass;

import java.util.ArrayList;

public class Biology extends LessonClass {

    private ArrayList<String> topicList;

    public Biology(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList.add("Ecology");
        topicList.add("Opportunities in Biology");
        topicList.add("Principles of Biology 1");
        topicList.add("Principles of Biology 2");
        topicList.add("Principles of Genetics");
        return topicList;
    }
 /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Biology class is the child of the LessonClass

      add following values to arrayList(topicList) in the override method that comes from the abstract class
     Ecology
     Opportunities in Biology
     Principles of Biology 1
     Principles of Biology 2
     Principles of Genetics
     return topicList

     */


/*

    Bu sınıf LessonClass sınıfının child sınıfıdır

    topicList isminde private String Arraylist oluşturun

    Biology sınıfı LessonClass classının child sınıfıdır


   abstract classtan gelen override methodunda  arrayList'e (topicList) aşağıdaki değerleri ekleyin

     Ecology
     Opportunities in Biology
     Principles of Biology 1
     Principles of Biology 2
     Principles of Genetics
     return topicList

     */


}
