import java.util.Scanner;


public class ClubBouncer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   //輸入年紀
	   System.out.print("What is your age? ");
	   Scanner keyboard = new Scanner(System.in);
	   int age = keyboard.nextInt();
	   
	   //輸入是否在邀請清單
	   System.out.print("Are you on the guestList(True/False)? ");
	   Scanner keyboard_2 = new Scanner(System.in);
	   boolean onGuestList = keyboard_2.nextBoolean();
       
	   //輸入魅力值
	   System.out.print("How charming are you (range:0.0~10.0)? ");
	   Scanner keyboard_3 = new Scanner(System.in);
	   double allure = keyboard_3.nextDouble();
	   if(allure>8.0) {
		  System.out.println("Wow, you are really confident of yourself!");
	   }
	
	   //輸入性別
	  
	   char inputChar = 0;
	   System.out.print("What's your gender(M/F)? "); 
   
	   //如果輸入的值不是'M' 'F'，顯示為true
	   boolean notExpectedgender;
   
       do {
    	   notExpectedgender = true;
    	   Scanner keyboard_4 = new Scanner(System.in);
    	   inputChar = keyboard_4.next().charAt(0);
    	   System.out.println("your gender is " +inputChar);
    	   if(inputChar == 'M' || inputChar == 'F') {
    			  notExpectedgender = false;
    		   	  System.out.println("valid input"); 
    		}
    	   else {
    		   System.out.println("invalid input, please try again");
    		   System.out.print("Please enter your gender (M/F) ");
    		   continue;
    	   }
       }while(notExpectedgender); //透過do while讓使用者輸入至少執行一次
       //直到notExpectedgender = false停止 loop
     
       //回覆是否可以進入Club 
       if( onGuestList || age >=21 || (inputChar =='F' && allure >=0)) {
    	   System.out.println("You are allowed to enter the club");
       } 
       else {
    	   System.out.println("You are not allowed to enter the club.");	  
       }
    
	}
}


/*Since char is a primitive type, you can just write c == ' '.
You only need to call equals() for reference types like String or Character.*/
