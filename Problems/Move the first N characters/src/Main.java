import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner in = new Scanner(System.in);
		String text = in.next();
		int n = in.nextInt();
		if (n > text.length()) {
			System.out.print(text);
			return;
		}
		System.out.print(text.substring(n));
		System.out.print(text.substring(0, n));
	}
}