package src.com.zarifahnaf;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Test validator = new Test();
        String email = null;
        String password = null;

        while (true) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter your email: ");
                email = scanner.nextLine();
                if (!validator.isValidEmail(email)) {
                    System.out.println("Email: Wrong format! Try again.");
                    continue;
                }
                System.out.print("Enter your password: ");
                password = scanner.nextLine();
                if (!validator.containsLetterAndDigit(password)) {
                    System.out.println("Password: Wrong format! Try again.");
                    continue;
                }
                break;
            }
        }
        System.err.println("Got email " + email + " and password " + password);

    }
}
