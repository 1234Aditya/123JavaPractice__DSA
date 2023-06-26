import java.util.Scanner;

public class greatestcd1 {
    static int Igcd(int x,int y){
        while (x%y!=0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p: ");
        int p = sc.nextInt();
        System.out.println("Enter q: ");
        int q = sc.nextInt();
        System.out.println(Igcd(p,q));
    }
}
