package encryptdecrypt;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	static HashMap<String, String> param = new HashMap<>();

	public static void main(String[] args) {
		for (int i = 0; i < args.length - 1; i++) {
			if (args[i].charAt(0) == '-') {
				param.put(args[i], args[i + 1]);
			}
		}
		String action = param.getOrDefault("-mode", "enc");
		String input = param.getOrDefault("-data", "");
		int shift = Integer.parseInt(param.getOrDefault("-key", "0"));
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
