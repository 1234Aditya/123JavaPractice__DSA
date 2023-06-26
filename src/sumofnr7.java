import java.util.Scanner;

public class sumofnr7 {
    static int sumofn(int n){
        int sum =0;
        if (n==0){
            return 0;
        }
        else if (n % 2 != 0) {//odd
            return sumofn(n-1)+n;
        }
        else{//even
            return sumofn(n-1)-n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println(sumofn(n));
    }
}
