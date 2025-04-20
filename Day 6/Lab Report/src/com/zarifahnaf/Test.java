package src.com.zarifahnaf;

public class Test {

    public boolean isValidEmail(String email) {
        if (email == null || !email.contains("@")) {
            return false;
        }

        int atIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");

        return atIndex > 0 &&
                dotIndex > atIndex + 1 &&
                dotIndex < email.length() - 1;
    }

    public boolean containsLetterAndDigit(String password) {
        if (password == null)
            return false;

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (hasLetter && hasDigit) {
                return true;
            }
        }

        return false;
    }
}