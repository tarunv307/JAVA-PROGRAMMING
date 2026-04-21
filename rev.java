import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextInt();  // take input from user
        String reversed = "";

        // Loop from last character to first
        for (int i =  - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}