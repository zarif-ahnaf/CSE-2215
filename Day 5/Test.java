import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Tester tester = new Tester();
        System.out.print("Enter a password to check its format:");
        try (Scanner scanner = new Scanner(System.in);) {

            while (true) {

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