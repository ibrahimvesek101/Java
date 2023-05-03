package Projeler.Yeni_projeler.Project_09.TestClass;


import Projeler.Yeni_projeler.Project_09.Lessons.LessonClass;
import Projeler.Yeni_projeler.Project_09.Lessons.Music;
import Projeler.Yeni_projeler.Project_09.Student.StudentClass;

public class MainClas {

    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("Gerard", "Captain2005", "Portugal");

        LessonClass lessonClass = new Music(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*
        Run the MainClass

        Result should be Exception in thread "main" java.lang.AssertionError: Location should be one of the following [USA, England, France, Germany, Canada]


         */
    }
}
