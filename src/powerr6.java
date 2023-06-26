import java.util.Scanner;

public class powerr6 {
    static int pow(int p,int q){
        //Base case
        if (q==0){
            return 1;
        }
        //small subproblem
        int smallans = pow(p,q-1);
        //self work
        int ans = p*smallans;
        return ans;
        // return pow(p,q-1)*p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p: ");
        int p = sc.nextInt();
        System.out.println("Enter q: ");
        int q = sc.nextInt();
        System.out.println(pow(p,q));
    }
}
