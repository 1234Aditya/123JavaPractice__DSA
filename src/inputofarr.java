import java.util.Scanner;

public class inputofarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in array: ");
        int n = sc.nextInt();
        int [] ages = new int[n];
        for (int i = 0;i<n;i++){
            ages[i] = sc.nextInt();
        }
        System.out.print("Elements of array: ");
        for (int age : ages){
            System.out.print(age + " ");
        }
    }
}