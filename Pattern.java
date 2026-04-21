import java.util.*;

public class Pattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];

        System.out.println("Enter 3 numbers:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}