package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static HashMap<String, String> param = new HashMap<>();

	public static void main(String[] args) throws IOException {
		for (int i = 0; i < args.length - 1; i++) {
			if (args[i].charAt(0) == '-') {
				param.put(args[i], args[i + 1]);
			}
		}
		String action = param.getOrDefault("-mode", "enc");
		// read input from data or file if no data
		String input = param.getOrDefault("-data", "");
		if (param.containsKey("-in") && !param.containsKey("-data")) {
			File inputFile = new File(param.get("-in"));
			Scanner in = new Scanner(inputFile);
			input = in.nextLine();
			in.close();
		}
		int shift = Integer.parseInt(param.getOrDefault("-key", "0"));
		String res = "";
		String algorithm = param.getOrDefault("-alg", "shift");
		System.out.println(input);
		switch (action) {
			case "enc":
				if (algorithm.equals("shift")) {
					res = EncShift(input, shift);
				} else {
					res = Enc(input, shift);
				}
				break;
			case "dec":
				if (algorithm.equals("shift")) {
					res = DecShift(input, shift);
				} else {
					res = Dec(input, shift);
				}
				break;
			default:
				break;
		}
		if (param.containsKey("-out")) {
			FileWriter out = new FileWriter(param.get("-out"));
			out.write(res);
			out.close();
		} else {
			System.out.println(res);
		}
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

	public static String EncShift(String input, int shift) {
		StringBuilder res = new StringBuilder();
		char[] orig = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isLetter(orig[i])) {
				res.append(orig[i]);
				continue;
			}
			int ascii = (orig[i] + shift);
			if (ascii > 97 + 26) {
				ascii = 97 + (ascii % (97 + 26));
			}
			res.append((char) ascii);
		}
		return res.toString();
	}

	public static String DecShift(String input, int shift) {
		StringBuilder res = new StringBuilder();
		char[] orig = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isLetter(orig[i])) {
				res.append(orig[i]);
				continue;
			}
			int ascii = (orig[i] - shift);
			if (ascii < 97) {
				ascii = 97 + 26 - (97 - ascii);
			}
			res.append((char) ascii);
		}
		return res.toString();
	}
}
