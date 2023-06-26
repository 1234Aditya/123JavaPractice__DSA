import java.util.Scanner;

public class powerr62 {
    static int pow1(int p,int q){
        //Base case
        if (q==0){
            return 1;
        }
        int smallans = pow1(p,q/2);
        if (q %2 ==0){
            return smallans* smallans;
        }
        return p*smallans* smallans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p: ");
        int p = sc.nextInt();
        System.out.println("Enter q: ");
        int q = sc.nextInt();
        System.out.println(pow1(p,q));
    }
}
