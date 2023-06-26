import java.util.Scanner;

public class sumnor5 {
    static int sumno(int n){
        if (n>=0 && n<=9){
            return n;
        }
//        int sum = n%10;
//        int smallans = sumno(n/10);
//        return sum + smallans;

        //recursive work --> small ans
        int smallans = sumno(n/10);

        //self work
        int ans = smallans + n%10;

        return ans;
        //return sumno(n/10)+n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println(sumno(n));
    }
}
