package encryptdecrypt;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String input = in.nextLine();
		int shift = in.nextInt();
		for (char i : input.toCharArray()) {
			if (!Character.isLetter(i)) {
				System.out.print(i);
				continue;
			}
			int ascii = i + shift;
			if (ascii > 97 + 26) {
				ascii = 97 + (ascii % (97 + 26));
			}
			char x = (char) (ascii);
			System.out.print(x);
		}
	}
}
