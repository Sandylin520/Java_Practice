public class EscapeSequenceComments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Learn\tJava\n\tthe\nHard\tWay\n\n");;// Learn tab Java changeline
		                                                      // tab the changeline
		                                                      // Hard tab Way changeline
		                                                      // changeline

		System.out.print("\tLearn Java the \"Hard\" Way!\n"); //  Learn Java the "Hard" Way!
		System.out.print("Hello\n");//This line prints hello
                System.out.print("Jello\by\n"); //This line prints Jelly, b is escaped
                System.out/*testing*/.println("Hard to believe,eh?");  //  /*testing*/ was inserted between, doesn;t cause troubles!
                System.out.println("Surprsied? /*abcde*/Or what did you expect?");
                System.out.println("\\ // -=- \\//");  //       \ // -=- \//
                System.out.println("\\\\ \\\\ \\\\\\\\"); // it takes 2 backslashes to make 1 backslash 
                System.out.println("I hope you understand \"escape sequences\" now.\n");
                //I hope you understand "escape sequences" now.
	}

}


/*
Note:
\" represents a quotation mark
\t is a tab
\n is a newLINE
\\ is how you display a backslash 

*/