import java.util.Scanner;

public class prefixsum1 {
    static void prefixsum1(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            arr[i] = arr[i]+arr[i-1];
        }
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
        prefixsum1(arr);
        System.out.print("Prefix sum array: ");
        printArray(arr);

    }
}
