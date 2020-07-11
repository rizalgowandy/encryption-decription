import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner in = new Scanner(System.in);
		String msg = in.nextLine();
		System.out.println(
			msg.toLowerCase().
				indexOf("the")
		);
	}
}