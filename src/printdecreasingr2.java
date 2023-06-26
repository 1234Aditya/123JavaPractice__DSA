import java.util.Scanner;

public class printdecreasingr2 {
    static void printr2(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printr2(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printr2(n);
    }
}
