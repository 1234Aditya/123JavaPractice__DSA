import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if(num % 2 ==0 && num % 3 ==0){
            System.out.println("Found Answer :"+num);
        }
    }
}
