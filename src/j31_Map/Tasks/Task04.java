package j31_Map.Tasks;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task04 {
    //Task->   TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("bir cümle giriniz :");
        String cümle= input.nextLine();

        TreeMap <Character,Integer> harfFrekans=new TreeMap<>();

        for (int i = 0; i < cümle.length(); i++) {
            Character keyOlanChar=cümle.charAt(i);
            if (harfFrekans.containsKey(cümle.charAt(i))) {
                harfFrekans.replace(cümle.charAt(i),harfFrekans.get((keyOlanChar))+1);
            }else {
                harfFrekans.put(cümle.charAt(i),1);
            }

        }
        System.out.println("harfFrekans = " + harfFrekans);
    }
}

