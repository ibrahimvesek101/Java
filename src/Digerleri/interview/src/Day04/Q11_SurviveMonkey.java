package Digerleri.interview.src.Day04;

public class Q11_SurviveMonkey {
    	/*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/
        public static void main(String[] args) {
            int numberOfBananas = 165;
            int survivalDays    = 0;
            boolean monkeyAlive = true;
            do {
                numberOfBananas -=4;
                if (numberOfBananas>0){
                    survivalDays++;
                    System.out.println("Bugun "+survivalDays+".gün ve "+numberOfBananas
                    +" adet muz kaldı");

                } else monkeyAlive=false;
            } while (monkeyAlive);



        }

}

