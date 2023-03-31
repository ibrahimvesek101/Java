package j09_Break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("e-mail giriniz : ");
        String email = input.nextLine();

        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@'){
                break;
            }else {
                System.out.print(email.charAt(i));
            }
        }

    }
}
