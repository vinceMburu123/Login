import java.util.Scanner;

public class Login {
    String username;
    String password;
    int attempts;

    public void Login() {
        Scanner access = new Scanner(System.in);
        System.out.println("Enter your username");
        username = access.nextLine();

        System.out.println("Enter your password");
        password = access.nextLine();

        attempts = 3;

        while (attempts > 0) {
            if (username.equals("Vincent") && password.equals("happy hour")) {
                System.out.println("Authentication successful!");
                break;
            } else {
                System.out.println("Authentication failed. Please try again.");
                attempts--;
                System.out.println("Remaining attempts: " + attempts);

                if (attempts == 0) {
                    System.out.println("Attempts exceeded.");
                    break;
                }

                
                System.out.println("Password characters:");
                for (char c : password.toCharArray()) {
                    System.out.print(c + " ");
                }
                System.out.println(); // Move to a new line after printing the password

                // Prompt the user to re-enter the password
                System.out.println("enter username again please:");
                password = access.nextLine();
                  System.out.println("Enter password again:");
                username = access.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Login user = new Login();
        user.Login();
    }
}
