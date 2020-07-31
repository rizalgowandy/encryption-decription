package day28;
import java.util.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String pattern = ".+@gmail.com";
        Pattern r = Pattern.compile(pattern);

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            Matcher m = r.matcher(emailID);
            if (m.find()) {
            	result.add(firstName);
            }
        }

        Collections.sort(result);
        for (String i: result) {
        	System.out.println(i);
        }

        scanner.close();
    }
}
