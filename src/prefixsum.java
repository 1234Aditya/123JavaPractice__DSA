import java.util.Scanner;

public class prefixsum {
    static  int[] prefixsum(int[] arr){
        int n = arr.length;
        int [] prev = new int[n];
        prev[0] =arr[0];
        for (int i = 1;i<n;i++){
            prev[i] = prev[i-1] + arr[i];
        }
        return prev;
    }
    static void printArray(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original array: ");
        printArray(arr);
        int [] ans = prefixsum(arr);
        System.out.print("Prefix sum array: ");
        printArray(ans);

    }
}
