class Problem {

	public static void main(String[] args) {
		int res;
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		switch (args[0]) {
			case "+":
				res = x + y;
				break;
			case "-":
				res = x - y;
				break;
			case "*":
				res = x * y;
				break;
			default:
				System.out.println("Unknown operator");
				return;
		}
		System.out.println(res);
	}
}