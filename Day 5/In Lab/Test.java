// Test.java 

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Tester tester = new Tester();
        try (Scanner scanner = new Scanner(System.in);) {
            while (true) {
                System.out.print("Enter Password:");
                String password = scanner.nextLine();

                if (tester.checkPassword(password)) {
                    System.out.println("Notification: Correct Format");
                    break;
                } else {
                    System.out.println("Notification: Wrong Format");
                }
            }
        }
    }

}