import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
            Welcome to Fizz Buzz!
            Submit a number and get an answer!
            Program will work with integer.
            To exit enter 'x'""");

        while (true) {

            try {
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("x")) {
                    System.out.println("Bye!");
                    scanner.close();
                    break;
                }

                int n = Integer.parseInt(input);
                System.out.println("Number: " + n);

                boolean isFizz = n % 3 == 0;
                boolean isBuzz = n % 5 == 0;

                if (isFizz && isBuzz) {
                    System.out.println("FizzBuzz!");
                } else if (isFizz) {
                    System.out.println("Fizz!");
                } else if (isBuzz) {
                    System.out.println("Buzz!");
                }

            } catch (Exception e) {
                System.out.println("Please submit a number or 'x' to exit");
            }
        }
    }
}
