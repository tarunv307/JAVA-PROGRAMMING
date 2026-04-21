import java.util.*;
public class reveachword {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);

        String a = s1.nextLine();

        String rev = "";

        for(int i = a.length() - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }

        System.out.println("Reversed string: " + rev);
    }
}