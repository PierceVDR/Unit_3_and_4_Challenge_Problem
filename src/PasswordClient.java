import java.util.Scanner;

public class PasswordClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a secure password that meets these requirements:");
        System.out.println("- Is at least 8 characters long");
        System.out.println("- Contains at least one uppercase letter");
        System.out.println("- Contains at least one lowercase letter");
        System.out.println("- Contains at least one numeric digit");
        System.out.println("- Contains at least one of these symbols: ! @ # $ % ^ & * ?");
        System.out.print("\nEnter your secure password: ");
        String password = scanner.nextLine();

    /* to be implemented
       create and use a SecurePassword object with the user’s password and determine
       if it’s secure using the isSecure() method.

       If it isn’t secure enough, provide them a status update using the status() method
       and prompting them to try repeatedly until they have a password that
       meets all requirements, at which point tell them "Password is secure" and end.

       Note that, as the user provides updated passwords, you will need to update the
       password in your SecurePassword object using the setter method, .setPassword(),
    */
        SecurePassword mySC = new SecurePassword(password);
        System.out.println(mySC.status());

        while ( !mySC.isSecure() ) {

            System.out.print("\nEnter a new secure password: ");
            mySC.setPassword(scanner.nextLine());

            System.out.println(mySC.status());
        }

        scanner.close();
    }
}
