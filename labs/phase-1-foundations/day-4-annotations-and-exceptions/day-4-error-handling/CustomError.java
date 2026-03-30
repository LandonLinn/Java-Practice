class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomError {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Too Young");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

        try {
            checkAge(21);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }

}
