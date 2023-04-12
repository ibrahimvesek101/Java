package Digerleri.interview.src.Day04;


import java.util.ArrayList;
import java.util.Arrays;

public class Q13_DuplicateValue {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        String str="Javaisalsoeasy";
        String str2=str;
        String output="";
        while(str2.length()>1) {
            String st=str2.substring(0,1);
            int uzunluk=str2.length();
            str2=str2.replaceAll(st,"");
            if (str2.length()<uzunluk-1) output+=st;
        }
        System.out.println("Result = "+output);
        ArrayList<String> dizi = new ArrayList<>();
        for (int i = 0; i <output.length() ; i++) {
            dizi.add(output.substring(i,i+1));
        }
        System.out.println(dizi);

    }
    

}

