import java.util.Arrays;

/* Please, do not rename it */
class Problem {

	public static void main(String[] args) {
		String operator = args[0];
		String[] arr = Arrays.copyOfRange(args, 1, args.length);
		int[] numbers = Arrays.stream(arr).
			mapToInt(Integer::parseInt)
			.toArray();
		// write your code here
		int res = numbers[0];
		switch (operator) {
			case "MAX":
				for (int i : numbers) {
					res = Math.max(i, res);
				}
				break;
			case "MIN":
				for (int i : numbers) {
					res = Math.min(i, res);
				}
				break;
			case "SUM":
				for (int i = 1; i < numbers.length; i++) {
					res += numbers[i];
				}
				break;
		}
		System.out.println(res);
	}
}