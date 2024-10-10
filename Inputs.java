import java.util.*;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();

        System.out.println("Hey! "+ name);

        System.out.print("Enter value of a : ");
        int a = input.nextInt();

        System.out.print("Enter value of b : ");
        int b = input.nextInt();
        
        input.close();
        
        System.out.println("Sum of a + b = " + (a + b));

    }
}
