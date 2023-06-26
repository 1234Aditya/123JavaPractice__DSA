import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count the digits: ");
        int a = sc.nextInt();
        int i = 0;
        while (a>0){
            a = a/10;
            i++;
        }
        System.out.println("The number of digits  in number are :"+i);
    }
}
