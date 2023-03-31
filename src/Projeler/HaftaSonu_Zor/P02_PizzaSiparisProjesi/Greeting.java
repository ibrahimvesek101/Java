package Projeler.HaftaSonu_Zor.P02_PizzaSiparisProjesi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Greeting {
	 static   Date dt = new Date();
     static   Calendar c = Calendar.getInstance();
     static  SimpleDateFormat df=new SimpleDateFormat();
       int hours = c.get(Calendar.HOUR_OF_DAY);
	public static String getTimeFromSystem() {
         c.setTime(dt);
        int hours = c.get(Calendar.HOUR_OF_DAY);

        if(6<hours&&hours<=12){       
            return "Good Morning";
        }else if(12<hours && hours<=16){        
            return "Good Afternoon";        
        }else if(16<hours&&hours<=21){         
            return "Good Evening";        
        }else {
            return "Good Night";
        }              
    }
	public static void  getMin() {
	 c.add(Calendar.MINUTE, 30);
	 System.out.println(df.format(c.getTime()));
		
	}
		
	}
/*int choice;
boolean misMatch;
do {
	try {
	     misMatch=false;
		 choice=scan.nextInt();
	}catch(InputMismatchException e) {
		 scan.nextInt();
		misMatch=true;
		System.out.println("Unexpected choice. please try again ");
	}
	return choice;
}while(misMatch==true);*/
