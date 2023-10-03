import java.util.Scanner;

public class Login {
    String username;
    String password;
    int attempts;

    public void authenticate() {
        Scanner access = new Scanner(System.in);
        System.out.println("Enter your username");
        username = access.nextLine();

        System.out.println("Enter your password");
        password = access.nextLine();

        attempts = 3;

        while (attempts > 0) {
            if (username.equals("Vincent") && password.equals("happy hour")) {
                System.out.println("Authentication successful!");
                password = null; 
                break;
            } else {
                System.out.println("Authentication failed. Please try again.");
                attempts--;
                System.out.println("Remaining attempts: " + attempts);

                if (attempts == 0) {
                    System.out.println("You've exceeded the maximum number of attempts.");
                }
            }
        }
        
    }

    public static void main(String[] args) {
        Login user = new Login();
        user.authenticate();
    }
}
