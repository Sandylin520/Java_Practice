public class CreatingVariables {

      public static void main(String[] args) {
		
      int x, y, age;
      double seconds, e, checking;
      String firstName, lastName, title;
      
      x = 10;
      y = 400;
      age =39;
      
      seconds = 4.71;
      e = 2.71828182845904523536; 
      checking = 1.89;
      
      firstName = "Graham";
      lastName = "Mitchell";
      title = "Mr.";
      
      System.out.println("The variable x contains "+ x);
      //The variable x contains 10
      
      System.out.println("The value "+ y + " is stored in the variable y.");
      //The value 400 is stored in the variable y.
      
      System.out.println("The experiment took " + seconds + " seconds.");
      //The experiment took 4.71 seconds.
      
      System.out.println("A favorite irrational # is Euler's number: " + e);
      //A favorite irrational # is Euler's number: 2.718281828459045
      //Doubles do not have enough significant figures to hold the value 2.71828182845904523536     
      
      System.out.println("Hopefully you have more than $" + checking + "!");
      //Hopefully you have more than $1.89!
      System.out.println("My name's "+ title + " " + firstName + lastName);
      //My name's Mr. GrahamMitchell
      
 }
}


/* 

Pay attention:
//A favorite irrational # is Euler's number: 2.718281828459045
//Doubles do not have enough significant figures to hold the value 2.71828182845904523536     
  
 */ 
