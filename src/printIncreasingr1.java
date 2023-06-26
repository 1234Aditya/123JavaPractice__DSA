import java.util.Scanner;

public class printIncreasingr1 {
    static void printn(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printn(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printn(n);
    }
}
