import java.util.Scanner;

public class factorialr3 {
    static int  factorial1(int n){
        //Base Case
        if(n == 0){
            return 1;
        }
        //Small subproblem
       int smallans = factorial1(n-1);
        //Big problem - Self Work
       int ans = n * smallans;
        return ans;
        //Or we can simply write
        // return n*factorial1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println(factorial1(n));
    }
}
