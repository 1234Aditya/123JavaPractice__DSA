import java.util.Scanner;

public class suffixsum {
    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] suffixsum(int[] arr){
        int n = arr.length;
        for (int i = n-2;i>=0;i--){
            arr[i] += arr[i+1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n =  sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+ n +" elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before suffix: ");
        printarr(arr);
        int [] suffixsum = suffixsum(arr);
        System.out.println("After suffix sum:");
        printarr(suffixsum);
    }
}
