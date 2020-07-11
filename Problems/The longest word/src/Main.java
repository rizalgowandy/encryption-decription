import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] words = line.split(" ");
		int index = 0;
		for (int i = 1; i < words.length; i++) {
			if (words[index].length() < words[i].length()) {
				index = i;
			}
		}
		System.out.println(words[index]);
	}
}