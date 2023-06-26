import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking a string as a input
        System.out.println("Enter your name:");
        //sc.next do not takes input after space.
        String name = sc.nextLine();
        System.out.println("Your name is :"+ name);
        //Taking int as a input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Entered number is : "+num);

    }
}
