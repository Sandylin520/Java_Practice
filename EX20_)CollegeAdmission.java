import static java.lang.System.*; //import System類別下所有的靜態成員，可以使用 '*' 字元
import java.util.Scanner;

public class CollegeAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        int math;
        out.println("welcome to UT Austin College Admissions Interface!");
        out.print("Please enter your SAT math score(200-800):");
        math = keyboard.nextInt();
        
        out.print("Admittance status");
        
        if( math>=790)
          out.print("CERTAIN");
        else if( math>=710)
          out.print("SAFE");
        else if( math>=580)
          out.print("probable");
        else if( math>=500)
          out.print("uncertain");
        else if( math>=390)
          out.print("unlikely");
        else//below 390
          out.print("denied");
          out.println();
	}

}

/*
  System>> out
您將java.lang.System類別中的out靜態成員import至程式中，編譯時編譯器遇到out名稱，
就會自動展開為System.out，所以這還是編譯器給的蜜糖（Compiler suger）。

*/