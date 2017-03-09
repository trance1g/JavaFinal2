	import java.util.Scanner;
	public class P2Launcher {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//initialize scanner
			Scanner keyboard = new Scanner(System.in);
			//declare variables
			P2 num1 = new P2();
			
			System.out.println("Enter a number of seconds: ");
			//input = keyboard.nextDouble();
			num1.getNum(keyboard.nextDouble());
		

		}

	}
