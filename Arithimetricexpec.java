import java.util.*;
public class Arithimetricexpec {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.print(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input, Please enter integers.");
        }
        finally{
            System.out.print("End of program");
        }
        
    }
}