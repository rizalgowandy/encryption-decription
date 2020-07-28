package day25;
import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (in.hasNext()) {
			int cur = in.nextInt();
			if (IsPrime(cur)) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}
		in.close();
	}

	public static boolean IsPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		long boundary = Math.round(Math.sqrt(n));
		for (int i = 2; i <= boundary; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}