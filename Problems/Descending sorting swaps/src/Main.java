import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// write your code here
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		int counter = 0;
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				int cur = Integer.parseInt(input[j]);
				int next = Integer.parseInt(input[j + 1]);
				if (cur < next) {
					String tmp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = tmp;
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}