import java.util.Scanner;

public class rectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int a = sc.nextInt();
        for (int i =1;i<=a;i++){
            for(int j = i;j<=a;j++){
                System.out.print(j);
            }
            for(int k =1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
