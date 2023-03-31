package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden  create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("kelime giriniz : ");

        String str = input.nextLine();

        String cikti="";

        for (int i = 0; i <= str.length()-1; i++) {

            if(!cikti.contains(str.substring(i,i+1))) {

                cikti+=str.substring(i,i+1); // substring bize harf harf verdi.

            }

            }
        System.out.println(cikti);
        }

    }
