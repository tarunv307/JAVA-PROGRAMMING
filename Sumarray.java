import java.util.Scanner;
public class Sumarray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int arr[]=new int[5];
        int sum=0;
        for(int i=0;i<=4;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=4;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
