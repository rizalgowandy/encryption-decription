package day26;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] actual = in.nextLine().split(" ");
		String[] expected = in.nextLine().split(" ");
		int actDay = Integer.parseInt(actual[0]);
		int actMonth = Integer.parseInt(actual[1]);
		int actYear = Integer.parseInt(actual[2]);
		int expDay = Integer.parseInt(expected[0]);
		int expMonth = Integer.parseInt(expected[1]);
		int expYear = Integer.parseInt(expected[2]);
		if (actYear > expYear) {
			int penalty = 10000;
			System.out.println(penalty);
			return;
		}
		if (actYear < expYear) {
			int penalty = 0;
			System.out.println(penalty);
			return;
		}
		if (actMonth > expMonth) {
			int penalty = 500 * (actMonth - expMonth);
			System.out.println(penalty);
			return;
		}
		if (actMonth < expMonth) {
			int penalty = 0;
			System.out.println(penalty);
			return;
		}
		if (actDay > expDay) {
			int penalty = 15 * (actDay - expDay);
			System.out.println(penalty);
			return;
		}
		int penalty = 0;
		System.out.println(penalty);
	}
}