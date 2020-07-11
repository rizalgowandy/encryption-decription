package encryptdecrypt;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String action = in.nextLine();
		String input = in.nextLine();
		int shift = in.nextInt();
		String res = "";
		switch (action) {
			case "enc":
				res = Enc(input, shift);
				break;
			case "dec":
				res = Dec(input, shift);
				break;
			default:
				break;
		}
		System.out.println(res);
	}

	public static String Enc(String input, int shift) {
		StringBuilder res = new StringBuilder();
		char[] orig = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			res.append((char) (orig[i] + shift));
		}
		return res.toString();
	}

	public static String Dec(String input, int shift) {
		StringBuilder res = new StringBuilder();
		char[] orig = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			res.append((char) (orig[i] - shift));
		}
		return res.toString();
	}
}
