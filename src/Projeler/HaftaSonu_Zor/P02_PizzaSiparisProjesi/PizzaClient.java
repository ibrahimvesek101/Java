package Projeler.HaftaSonu_Zor.P02_PizzaSiparisProjesi;

import java.util.Scanner;
public class PizzaClient {
static Scanner scan=new Scanner(System.in);
static Circle circle;
static Pizza pizza;
static PizzaDeal pDeal= new PizzaDeal();
static Rectangle rectangle;

	public static void main(String[] args) throws InterruptedException {

        run();
	}
	static void run() throws InterruptedException {
		System.out.println(Greeting.getTimeFromSystem().toUpperCase()+ " Dear Customer\n");
		menu();
		System.out.println("Welcome to Anar-Com Pizza..");
		System.out.print("Select your shape: \n ");
   	 switch (tryCatch(2)) {
		case 1: 
			 System.out.println("Please,select your size of Pizza");
			System.out.println("1 for small \n2 for medium \n3 for large");
			switch(tryCatch(3)) {
			case 1:
				int sRadius=8;
			     circle=new Circle(sRadius);
			     double sPrice=circle.getArea()/10;
				 pizza=new Pizza(sPrice,circle);
				 pDeal.deal(pizza);
				 //u can cut of float price values after kama with %3.4
				 System.out.println("Dear customer total cust is :" +pizza.getPrice() +"$" );
				 Thread.sleep(2000);
				 System.out.println("Dear custumer your pizza will prepare in 30 mins will delivery you about  "  );
				 Greeting.getMin();
				break;
			case 2:
				int mRadius=10;
				 circle=new Circle(mRadius);
				 double mPrice=circle.getArea()/10;
				 pizza=new Pizza(mPrice,circle);
				 pDeal.deal(pizza);
				 System.out.println("Dear customer total cust is :" +pizza.getPrice() +"$" );
				 Thread.sleep(2000);
				 System.out.println("Dear custumer your pizza will prepare in 30 mins will delivery to you about  "  );
				 Greeting.getMin();
				break;
			case 3:
				int lRadius=12;
				 circle=new Circle(lRadius);
				 double lPrice=circle.getArea()/10;
				 pizza=new Pizza(lPrice,circle);
				 pDeal.deal(pizza);
				 System.out.println("Dear customer total cust is :" +pizza.getPrice() +"$" );
				 Thread.sleep(2000);
				 System.out.println("Dear custumer your pizza will prepare in 30 mins will delivery you about  "  );
				 Greeting.getMin();
				break;
			default:
				System.out.println("\"Unexpected size: \"");
				//throw new IllegalArgumentException("Unexpected size: " + tryCatch());
			}
			break;
		   case 2:
			   System.out.println("Please,select your size of Pizza");
				System.out.println("1 for small \n 2 for medium \n 3 for large");
		     switch(tryCatch(3)) {
		     case 1:
		    		int sWidth=10;
					int sHeigth=20;
					rectangle=new Rectangle(sWidth,sHeigth);
					double srPrice=rectangle.getArea()/10;
					pizza=new Pizza(srPrice,rectangle);
					pDeal.deal(pizza);
					 System.out.println("Dear customer total cust is :" +pizza.getPrice() +"$" );
					 Thread.sleep(2000);
					 System.out.println("Dear custumer your pizza will prepare in 30 mins will arrive you about  "  );
					 Greeting.getMin();
		    	 break;
		     case 2:
		    	 int mWidth=15;
					int mHeigth=30;
					rectangle=new Rectangle(mWidth,mHeigth);
					double mrPrice=rectangle.getArea()/10;
					pizza=new Pizza(mrPrice,rectangle);
					pDeal.deal(pizza);
					 System.out.println("Dear customer total cust is :" +pizza.getPrice() +"$" );
					 Thread.sleep(2000);
					 System.out.println("Dear custumer your pizza will prepare in 30 mins will arrive you about  "  );
					 Greeting.getMin();
		    	 break;
		     case 3:
		    	    int lWidth=20;
					int lHeigth=40;
					rectangle=new Rectangle(lWidth,lHeigth);
					double lrPrice=rectangle.getArea()/10;
					pizza=new Pizza(lrPrice,rectangle);
					pDeal.deal(pizza);
					System.out.println("Dear customer total cust is :" +pizza.getPrice() +"$" );
					Thread.sleep(2000);
					System.out.println("Dear custumer your pizza will prepare in 30 mins will arrive you about  "  );
					Greeting.getMin();
		    	 break;
		    	 default:
		    		 System.out.println("\"Unexpected size: \"" );
		    		 //throw new IllegalArgumentException("Unexpected size: " + tryCatch());
		     }
			break;
		default:
			System.out.println("\"Unexpected size: \"" );
			//throw new IllegalArgumentException("Unexpected choice: " + choice);
		}
	}
	static int tryCatch(int menu) { // for choosing form  we send to 2,for choosing to size sending 3 and call the menu with loop
        
        Integer choice = null;
        
        do {
             String input = scan.nextLine();
             
             try {
                 choice = Integer.parseInt(input);
                 if(choice < 1 || choice > menu) {
                     choice = null;
                     throw new IllegalArgumentException("your choce must between  1 and " + menu );
                 }
             } catch (NumberFormatException e) {
                 System.err.println("Dear customer \nPlease, select your shape again.");
                continue;
             } catch (IllegalArgumentException f) {
                 System.err.println( "Dear customer \nPlease, select your shape again. \n(don't input NaN" +f.getMessage());
                // continue;
             }
        } while(choice == null);
        
        return choice.intValue();
        }
	
		
	
	
	
     static void menu() { 
    	 // TITLES
         String welcomeHeader = "+---------------------------------------------------+";
         String welcomeBanner = "|          WELCOME TO ANAR-COM PIZZA HOUSE          |";
         String menuPizzaType = "|              SELECT YOUR PIZZA SHAPE              |";
         String menuPizzaSize = "|              SELECT YOUR PIZZA SIZE               |";

         // SHAPE MENU
         String menuShapeRow1 = "           ******              ***************       ";
         String menuShapeRow2 = "        ***      ***           **           **       ";
         String menuShapeRow3 = "       **          **          **           **       ";
         String menuShapeRow4 = "      **            **         **           **       ";
         String menuShapeKeys = "        1 FOR ROUND            2 FOR RECTANGLE       ";
         
                 // SIZE MENU
         String menuSizesKeys = "    1 FOR SMALL     2 FOR MEDIUM     3 FOR LARGE     ";


         // WELCOME PRINTER
         System.out.println(welcomeHeader);
         System.out.println(welcomeBanner);
         System.out.println(welcomeHeader);
         System.out.println();
         
         // SHAPE MENU PRINTER
         System.out.println(welcomeHeader);
         System.out.println(menuPizzaType);
         System.out.println(welcomeHeader);
         System.out.println();
         System.out.printf("%1$s\n%2$s\n%3$s\n%4$s\n%4$s\n%3$s\n%2$s\n%1$s\n", menuShapeRow1, menuShapeRow2, menuShapeRow3, menuShapeRow4);
         System.out.println(menuShapeKeys);
         System.out.println();
         
         // SIZE MENU PRINTER
         System.out.println(welcomeHeader);
         System.out.println(menuPizzaSize);
         System.out.println(welcomeHeader);
         System.out.println();
         System.out.println(menuSizesKeys);
     }
 
     }

