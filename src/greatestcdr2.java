import java.util.Scanner;

public class greatestcdr2 {
    static int gcd(int x,int y){
        if (y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p: ");
        int p = sc.nextInt();
        System.out.println("Enter q: ");
        int q = sc.nextInt();
        System.out.println(gcd(p,q));
    }
}
