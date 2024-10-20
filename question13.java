import java.util.Scanner;
public class question13 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = reader.nextInt();

        int i;
        for (i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                break;
            }
        }

        if (i > Math.sqrt(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
