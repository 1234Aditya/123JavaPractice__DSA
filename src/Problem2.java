import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int original = n;
        while (n>0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("The sum of digits are: "+sum);
    }
}
