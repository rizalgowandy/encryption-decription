class Problem {

	public static void main(String[] args) {
		// Write your code here
		for (int i = 0; i < args.length; i++) {
			if (i % 2 == 1) {
				System.out.print("=");
			} else if (i > 0) {
				System.out.println();
			}
			System.out.print(args[i]);
		}
	}
}