import java.util.Scanner;
public class SecretWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String secret = "Please", guess;
		
		System.out.print("What's the secret word ");
		guess = keyboard.next();//next()是以空白或換行為區格
		
		if(guess.equals(secret)) {
			System.out.println("That's the correct!");
		}
		
		else {
			System.out.println("No,secret word isn't \""+ guess+ "\".");
		}
		
		if(guess == secret) {
			System.out.println("(This will never ever show,no matter what.)");
		}		
	}

}


/*
Note:
如果你的目的是判斷兩個字串物件的『內容值』有沒有相等，顯然不能用『==』去做比對。
用『==』運算子比對的是 變數a 與 變數b 的『值』有沒有相等，字串是參考資料型態，
變數guess及變數secret只是存放在Stack區的變數，他們的內容值是真實物件的reference，並不是物件內容。
但我們目的不是要比較reference有沒有相等，而是比較字串物件的內容有沒有相等，所以不應該用『==』。
需要比對字串內容值的話，需要的是字串方法： equals()
*/