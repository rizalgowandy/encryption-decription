import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            try {
                int x = in.nextInt();
                if (x == 0) {
                    break;
                }
                System.out.println(x * 10);
            } catch (Exception e) {
                String x = in.next();
                System.out.println("Invalid user input: " + x);
            }
        }
    }
}