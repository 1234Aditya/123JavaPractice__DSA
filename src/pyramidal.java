import java.util.Scanner;

public class pyramidal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int a = sc.nextInt();
        for (int i = 1;i<=a;i++) {
            //print a-i for spaces
            for (int j = 1;j<=a-i;j++){
                System.out.print(" ");
            }
            //print 2*i-1 for stars
            for (int k = 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
