package Digerleri.interview.src.Day04;

public class Q08_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */

    public static void main(String[] args) {
        String str = "aaabbabbbccaccccccaq";
        tekrarlar(str);
    }

    private static void tekrarlar(String str) {
        String output="";
        for (int i = 0; i <str.length() ; i++) {
            int counter=0;
            for (int j = i; j <str.length() ; j++) {
                if (str.substring(i,i+1).equals(str.substring(j,j+1))) {
                    counter++;
                }
            }
            if (!output.contains(str.substring(i,i+1))){
                output +=str.substring(i,i+1)+counter;
            }
        }
        System.out.println(output);
    }


}
